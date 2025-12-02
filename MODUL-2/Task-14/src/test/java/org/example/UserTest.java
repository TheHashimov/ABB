package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testConstructorAndGetters() {
        BorrowRecord r = new BorrowRecord(
                new Book("1984", "Orwell", 1949, 5.0, true),
                LocalDate.now(),
                null
        );

        User u = new User("Aydin", 25, List.of(r));

        assertEquals("Aydin", u.getName());
        assertEquals(25, u.getAge());
        assertEquals(1, u.getBorrowHistory().size());
    }

    @Test
    void testAddBorrowRecord() {
        User u = new User("Leyla", 20, null);

        BorrowRecord r = new BorrowRecord(
                new Book("Animal Farm", "Orwell", 1945, 4.8, true),
                LocalDate.now(),
                null
        );

        u.addBorrowRecord(r);

        assertEquals(1, u.getBorrowHistory().size());
        assertEquals("Animal Farm", u.getBorrowHistory().get(0).getBook().getTitle());
    }

    @Test
    void testToString() {
        User u = new User("Murad", 30, null);
        assertEquals("Murad (30 y.o.)", u.toString());
    }
}
