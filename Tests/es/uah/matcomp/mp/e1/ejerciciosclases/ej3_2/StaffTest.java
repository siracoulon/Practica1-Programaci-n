package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StaffTest {

    @Test
    public void testConstructorWithParameters() {
        Staff staff = new Staff("John Doe", "123 Main St", "High School", 50000.0);
        assertEquals("John Doe", staff.getName());
        assertEquals("123 Main St", staff.getAddress());
        assertEquals("High School", staff.getSchool());
        assertEquals(50000.0, staff.getPay(), 0.0001);
    }

    @Test
    public void testConstructorDefault() {
        Staff staff = new Staff();
        assertNull(staff.getName());
        assertNull(staff.getAddress());
        assertNull(staff.getSchool());
        assertEquals(0.0, staff.getPay(), 0.0001);
    }

    @Test
    public void testSetSchool() {
        Staff staff = new Staff("Jane Doe", "456 Oak St", "Middle School", 45000.0);
        staff.setSchool("Elementary School");
        assertEquals("Elementary School", staff.getSchool());
    }

    @Test
    public void testSetPay() {
        Staff staff = new Staff("Alice", "789 Pine St", "University", 60000.0);
        staff.setPay(65000.0);
        assertEquals(65000.0, staff.getPay(), 0.0001);
    }

    @Test
    public void testToString() {
        Staff staff = new Staff("Bob", "101 Elm St", "College", 70000.0);
        String expectedString = "Staff[name= Bob, address= 101 Elm St],[School: Collegepay: 70000.0]";
        assertEquals(expectedString, staff.toString());
    }
}

