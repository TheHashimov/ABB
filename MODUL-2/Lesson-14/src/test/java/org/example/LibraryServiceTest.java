package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private Book b1, b2, b3;
    private User u1, u2;
    private LibraryService service;

    @BeforeEach
    void setup() {
        b1 = new Book("A", "Author1", 2000, 4.5, true);
        b2 = new Book("B", "Author1", 2010, 4.8, true);
        b3 = new Book("C", "Author2", 2020, 4.9, false);

        BorrowRecord r1 = new BorrowRecord(b1,
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 1, 5));

        BorrowRecord r2 = new BorrowRecord(b2,
                LocalDate.of(2024, 1, 2),
                null);

        u1 = new User("Aydin", 25, List.of(r1, r2));

        BorrowRecord r3 = new BorrowRecord(b3,
                LocalDate.of(2024, 1, 1),
                null);

        u2 = new User("Leyla", 22, List.of(r3));

        service = new LibraryService(List.of(b1, b2, b3), List.of(u1, u2));
    }

    @Test
    void testFindRecommendedBookForUser() {
        Optional<Book> recommended = service.findRecommendedBookForUser(u1);

        assertTrue(recommended.isPresent());
        assertEquals("B", recommended.get().getTitle());   // highest rated by Author1
    }

    @Test
    void testFindRecommendedBookForUser_EmptyHistory() {
        User emptyUser = new User("Empty", 30, new ArrayList<>());
        assertTrue(service.findRecommendedBookForUser(emptyUser).isEmpty());
    }

    @Test
    void testFindTopReaderOfMonth() {
        Optional<User> result = service.findTopReaderOfMonth(1, 2024);

        assertTrue(result.isPresent());
        assertEquals("Aydin", result.get().getName());
    }

    @Test
    void testFindTopReaderOfMonth_NoMatches() {
        Optional<User> result = service.findTopReaderOfMonth(12, 1999);
        assertTrue(result.isEmpty());
    }
}
