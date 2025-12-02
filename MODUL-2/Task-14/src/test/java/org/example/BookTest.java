package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BookTest {

    @Test
    void testGetters() {
        Book b = new Book("1984", "Orwell", 1949, 4.8, true);

        assertEquals("1984", b.getTitle());
        assertEquals("Orwell", b.getAuthor());
        assertEquals(1949, b.getYear());
        assertEquals(4.8, b.getRating());
        assertTrue(b.isAvailable());
    }

    @Test
    void testSetAvailable() {
        Book b = new Book("1984", "Orwell", 1949, 4.8, true);
        b.setAvailable(false);
        assertFalse(b.isAvailable());
    }

    @Test
    void testToString() {
        Book b = new Book("1984", "Orwell", 1949, 4.8, true);
        assertEquals("1984 (Orwell, 1949) 4.8", b.toString());
    }

    @Test
    void testEqualsAndHashcode() {
        Book b1 = new Book("1984", "Orwell", 1949, 4.8, true);
        Book b2 = new Book("1984", "Someone", 2000, 3.0, false);

        assertEquals(b1, b2);
        assertEquals(b1.hashCode(), b2.hashCode());
    }
}
