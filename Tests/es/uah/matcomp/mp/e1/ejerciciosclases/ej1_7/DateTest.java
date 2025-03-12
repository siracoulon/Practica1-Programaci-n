package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void testConstructorAndGetters() {
        Date date = new Date(15, 8, 2023);
        assertEquals(15, date.getDay());
        assertEquals(8, date.getMonth());
        assertEquals(2023, date.getYear());
    }

    @Test
    void testSetters() {
        Date date = new Date(1, 1, 2000);

        date.setDay(25);
        assertEquals(25, date.getDay());

        date.setMonth(12);
        assertEquals(12, date.getMonth());

        date.setYear(2025);
        assertEquals(2025, date.getYear());
    }

    @Test
    void testSetDate() {
        Date date = new Date(1, 1, 2000);
        date.setDate(10, 5, 2024);

        assertEquals(10, date.getDay());
        assertEquals(5, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test
    void testToString() {
        Date date1 = new Date(5, 10, 2023);
        assertEquals("05/10/2023", date1.toString());

        Date date2 = new Date(15, 12, 2023);
        assertEquals("15/12/2023", date2.toString());

        Date date3 = new Date(1, 1, 2000);
        assertEquals("01/01/2000", date3.toString());
    }
}