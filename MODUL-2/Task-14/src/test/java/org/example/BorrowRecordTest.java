package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class BorrowRecordTest {
    @Test
    void testGetters() {
        Book book = new Book("1984", "Orwell", 1949, 4.9, true);
        LocalDate bd = LocalDate.of(2024, 1, 1);
        LocalDate rd = LocalDate.of(2024, 1, 10);

        BorrowRecord r = new BorrowRecord(book, bd, rd);

        assertEquals(book, r.getBook());
        assertEquals(bd, r.getBorrowedDate());
        assertEquals(rd, r.getReturnedDate());
    }

    @Test
    void testIsReturned() {
        Book book = new Book("1984", "Orwell", 1949, 4.9, true);

        BorrowRecord r1 = new BorrowRecord(book, LocalDate.now(), LocalDate.now());
        BorrowRecord r2 = new BorrowRecord(book, LocalDate.now(), null);

        assertTrue(r1.isReturned());
        assertFalse(r2.isReturned());
    }

    @Test
    void testToString() {
        Book book = new Book("1984", "Orwell", 1949, 4.9, true);
        BorrowRecord r = new BorrowRecord(book, LocalDate.of(2024,1,1), null);

        assertEquals("1984 borrowed at 2024-01-01 (not returned)", r.toString());
    }
}
