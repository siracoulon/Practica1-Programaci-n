package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testConstructorWithParameters() {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1500.0);
        assertEquals("John Doe", student.getName());
        assertEquals("123 Main St", student.getAddress());
        assertEquals("Computer Science", student.getProgram());
        assertEquals(2, student.getYear());
        assertEquals(1500.0, student.getFee(), 0.0001);
    }

    @Test
    public void testConstructorDefault() {
        Student student = new Student();
        assertNull(student.getName());
        assertNull(student.getAddress());
        assertNull(student.getProgram());
        assertEquals(0, student.getYear());
        assertEquals(0.0, student.getFee(), 0.0001);
    }

    @Test
    public void testSetProgram() {
        Student student = new Student("Jane Doe", "456 Oak St", "Mathematics", 3, 2000.0);
        student.setProgram("Physics");
        assertEquals("Physics", student.getProgram());
    }

    @Test
    public void testSetYear() {
        Student student = new Student("Alice", "789 Pine St", "Biology", 1, 1800.0);
        student.setYear(4);
        assertEquals(4, student.getYear());
    }

    @Test
    public void testSetFee() {
        Student student = new Student("Bob", "101 Elm St", "Chemistry", 2, 2200.0);
        student.setFee(2500.0);
        assertEquals(2500.0, student.getFee(), 0.0001);
    }

    @Test
    public void testToString() {
        Student student = new Student("Charlie", "202 Birch St", "Engineering", 3, 3000.0);
        String expectedString = "Student: [name= Charlie, address= 202 Birch St],[program= Engineering, year= 3, fee= 3000.0]";
        assertEquals(expectedString, student.toString());
    }
}


