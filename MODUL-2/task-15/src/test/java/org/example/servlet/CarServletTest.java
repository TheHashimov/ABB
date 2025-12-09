package org.example.servlet;

import org.example.dto.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarServletTest {

    private CarServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext context;

    private StringWriter responseWriter;

    @BeforeEach
    void setUp() throws Exception {
        servlet = new CarServlet();
        servlet.init(); // <- Mütləq

        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        context = mock(ServletContext.class);

        // ServletContext mock
        when(request.getServletContext()).thenReturn(context);

        // Response writer mock
        responseWriter = new StringWriter();
        PrintWriter pw = new PrintWriter(responseWriter, true);
        when(response.getWriter()).thenReturn(pw);
    }

    @Test
    void testCarServletResponseStatus() throws Exception {
        servlet.doGet(request, response);
        verify(response).setStatus(200);
    }

    @Test
    void testCarServletContentType() throws Exception {
        servlet.doGet(request, response);
        verify(response).setContentType("text/html");
    }

    @Test
    void testCarServletBodyContainsCar() throws Exception {
        servlet.doGet(request, response);
        String body = responseWriter.toString();
        assertTrue(body.contains("Car{color='White', speed=100}"));
    }

    @Test
    void testCarServletContextAttributeSet() throws Exception {
        // Test shared context attribute
        servlet.getServletContext().setAttribute("sharedMessage", "Hello XYZ");
        verify(context, never()).setAttribute("dummy", "value"); // sadə check
    }
}
