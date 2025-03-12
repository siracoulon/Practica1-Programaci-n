package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        // Creamos un objeto Rectangle con un width de 4.0 y length de 5.0
        rectangle = new Rectangle(4.0, 5.0);
    }

    @Test
    public void testGetArea() {
        // Verificamos que el área calculada sea correcta
        double expectedArea = 4.0 * 5.0;
        assertEquals(expectedArea, rectangle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        // Verificamos que el perímetro calculado sea correcto
        double expectedPerimeter = 2 * 4.0 + 2 * 5.0;
        assertEquals(expectedPerimeter, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        // Verificamos que el método toString devuelva la representación correcta
        String expectedString = "Rectangle{width=4.0, length=5.0}";
        assertEquals(expectedString, rectangle.toString());
    }
}
