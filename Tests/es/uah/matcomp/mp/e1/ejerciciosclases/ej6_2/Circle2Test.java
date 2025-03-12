package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Circle2Test {
    private Circle2 circle;

    @BeforeEach
    public void setUp() {
        // Creamos un objeto Circle2 con un radio de 5.0
        circle = new Circle2(5.0);
    }

    @Test
    public void testGetArea() {
        // Verificamos que el área calculada sea correcta
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        // Verificamos que el perímetro calculado sea correcto
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        // Verificamos que el método toString devuelva la representación correcta
        String expectedString = "Circle[radius=5.0]";
        assertEquals(expectedString, circle.toString());
    }
}
