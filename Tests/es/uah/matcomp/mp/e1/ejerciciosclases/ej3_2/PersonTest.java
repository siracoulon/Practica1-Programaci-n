package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorWithParameters() {
        Person person = new Person("John Doe", "123 Main St");
        assertEquals("John Doe", person.getName());
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    public void testConstructorDefault() {
        Person person = new Person();
        assertNull(person.getName());
        assertNull(person.getAddress());
    }

    @Test
    public void testSetAddress() {
        Person person = new Person("Jane Doe", "456 Oak St");
        person.setAddress("789 Pine St");
        assertEquals("789 Pine St", person.getAddress());
    }

    @Test
    public void testToString() {
        Person person = new Person("Alice", "101 Elm St");
        String expectedString = "[name= Alice, address= 101 Elm St]";
        assertEquals(expectedString, person.toString());
    }
}

