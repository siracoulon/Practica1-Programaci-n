package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        // Inicializamos un círculo con el radio por defecto
        circle = new Circle();
    }

    @Test
    void testConstructorDefault() {
        // Verificar que el constructor por defecto establece el radio como 1.0
        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void testConstructorWithRadius() {
        // Verificar que el constructor con un radio dado inicializa correctamente el radio
        circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void testGetArea() {
        // Verificar que el método getArea devuelve el área correcta para un círculo
        circle.setRadius(3.0);
        double expectedArea = Math.PI * 3.0 * 3.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        // Verificar que el método getPerimeter devuelve el perímetro correcto para un círculo
        circle.setRadius(4.0);
        double expectedPerimeter = 2 * Math.PI * 4.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testSetRadius() {
        // Verificar que el método setRadius modifica correctamente el radio
        circle.setRadius(7.0);
        assertEquals(7.0, circle.getRadius());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta del círculo
        circle.setRadius(2.0);
        String expectedString = "Circle[Shape[color=red,filled=true]radius=2.0]";
        assertEquals(expectedString, circle.toString());
    }
}
