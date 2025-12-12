package org.abb_tech.lesson5.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.abb_tech.lesson5.dto.CarDto;
import org.abb_tech.lesson5.exception.CarNotFoundException;
import org.abb_tech.lesson5.repository.CarRepositoryImpl;
import org.abb_tech.lesson5.service.CarService;
import org.abb_tech.lesson5.service.CarServiceImpl;

import java.io.IOException;

@WebServlet(name = "CarController", urlPatterns = "/cars")
public class CarController extends HttpServlet {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private CarService carService;

    @Override
    public void init() throws ServletException {
        carService = new CarServiceImpl(new CarRepositoryImpl());
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try {
            if (id != null) {
                CarDto car = carService.getCarById(Integer.parseInt(id));
                resp.setContentType("application/json");
                resp.getWriter().println(OBJECT_MAPPER.writeValueAsString(car));
            } else {
                resp.setContentType("application/json");
                resp.getWriter().println(OBJECT_MAPPER.writeValueAsString(carService.getCars()));
            }
            resp.setStatus(200);
        } catch (CarNotFoundException e) {
            resp.setStatus(404);
            resp.getWriter().println("Car not found");
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal Server Error");
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        CarDto carDto = OBJECT_MAPPER.readValue(req.getReader(), CarDto.class);
        carService.saveCar(carDto);
        resp.setStatus(201);
    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try {
            if (id == null) {
                resp.setStatus(400);
                resp.getWriter().println("ID is required");
                return;
            }
            carService.deleteCarById(Integer.parseInt(id));
            resp.setStatus(204); // No Content
        } catch (CarNotFoundException e) {
            resp.setStatus(404);
            resp.getWriter().println("Car not found");
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal Server Error");
        }
    }

    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        try {
            if (id == null) {
                resp.setStatus(400);
                resp.getWriter().println("ID is required");
                return;
            }
            CarDto carDto = OBJECT_MAPPER.readValue(req.getReader(), CarDto.class);
            carService.updateCar(Integer.parseInt(id), carDto);
            resp.setStatus(200);
        } catch (CarNotFoundException e) {
            resp.setStatus(404);
            resp.getWriter().println("Car not found");
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal Server Error");
        }
    }
}
