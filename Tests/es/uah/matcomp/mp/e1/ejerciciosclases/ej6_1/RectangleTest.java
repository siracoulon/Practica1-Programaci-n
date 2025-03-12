package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        // Inicializamos un rectángulo con valores por defecto
        rectangle = new Rectangle();
    }

    @Test
    void testConstructorDefault() {
        // Verificar que el constructor por defecto establece la longitud y el ancho como 1.0
        assertEquals(1.0, rectangle.getLength());
        assertEquals(1.0, rectangle.getWidth());
    }

    @Test
    void testConstructorWithLengthAndWidth() {
        // Verificar que el constructor con longitud y ancho dados inicializa correctamente el rectángulo
        rectangle = new Rectangle(4.0, 6.0);
        assertEquals(4.0, rectangle.getLength());
        assertEquals(6.0, rectangle.getWidth());
    }

    @Test
    void testConstructorWithAllAttributes() {
        // Verificar que el constructor con todos los atributos (incluido color y filled) inicializa correctamente
        rectangle = new Rectangle(4.0, 6.0, "red", true);
        assertEquals(4.0, rectangle.getLength());
        assertEquals(6.0, rectangle.getWidth());
        assertEquals("red", rectangle.getColor());
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testGetArea() {
        // Verificar que el método getArea devuelve el área correcta para un rectángulo
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);
        double expectedArea = 5.0 * 3.0;
        assertEquals(expectedArea, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        // Verificar que el método getPerimeter devuelve el perímetro correcto para un rectángulo
        rectangle.setLength(4.0);
        rectangle.setWidth(6.0);
        double expectedPerimeter = 2 * (4.0 + 6.0);
        assertEquals(expectedPerimeter, rectangle.getPerimeter());
    }

    @Test
    void testSetLength() {
        // Verificar que el método setLength modifica correctamente la longitud
        rectangle.setLength(10.0);
        assertEquals(10.0, rectangle.getLength());
    }

    @Test
    void testSetWidth() {
        // Verificar que el método setWidth modifica correctamente el ancho
        rectangle.setWidth(8.0);
        assertEquals(8.0, rectangle.getWidth());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta del rectángulo
        rectangle.setLength(2.0);
        rectangle.setWidth(3.0);
        String expectedString = "Rectangle[Shape[color=null, filled=false]length=2.0,width=3.0]";
        assertEquals(expectedString, rectangle.toString());
    }
}
