package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void getId() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(1, employee.getId());
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("John", employee.getFirstName());
    }

    @Test
    void getLastName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("Doe", employee.getLastName());
    }

    @Test
    void getName() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals("John Doe", employee.getName());
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(50000, employee.getSalary());
    }

    @Test
    void setSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        employee.setSalary(60000);
        assertEquals(60000, employee.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        assertEquals(600000, employee.getAnnualSalary()); // 50000 * 12 = 600000
    }

    @Test
    void raiseSalary() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        int newSalary = employee.raiseSalary(10); // Aumento del 10%
        assertEquals(55000, newSalary); // 50000 + (50000 * 10 / 100) = 55000
    }

    @Test
    void testToString() {
        Employee employee = new Employee(1, "John", "Doe", 50000);
        String expected = "Employee[id=1,name=John Doe,salary=50000]";
        assertEquals(expected, employee.toString());
    }
}