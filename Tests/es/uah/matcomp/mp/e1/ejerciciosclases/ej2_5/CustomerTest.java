package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        // Inicializamos un cliente antes de cada test
        customer = new Customer(1, "John Doe", 'm');
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals('m', customer.getGender());
    }

    @Test
    void testGetId() {
        // Verificar que el método getId devuelve el valor correcto
        assertEquals(1, customer.getId());
    }

    @Test
    void testGetName() {
        // Verificar que el método getName devuelve el valor correcto
        assertEquals("John Doe", customer.getName());
    }

    @Test
    void testGetGender() {
        // Verificar que el método getGender devuelve el valor correcto
        assertEquals('m', customer.getGender());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta
        String expected = "John Doe(1)";
        assertEquals(expected, customer.toString());
    }
}
