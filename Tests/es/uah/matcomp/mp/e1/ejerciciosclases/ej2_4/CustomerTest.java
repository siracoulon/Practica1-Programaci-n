package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        // Inicializamos un cliente antes de cada test
        customer = new Customer(1, "John Doe", 10);
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void testSettersAndGetters() {
        // Verificar que los getters y setters funcionan correctamente

        // Cambiar discount
        customer.setDiscount(20);
        assertEquals(20, customer.getDiscount());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta
        String expected = "John Doe(1)(10%)";
        assertEquals(expected, customer.toString());
    }
}
