package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    private Shape shape;

    @BeforeEach
    void setUp() {
        // Inicializamos una clase concreta que extienda Shape (por ejemplo, Circle o Rectangle) para poder probar los métodos de Shape.
        shape = new Circle(5.0);  // Utilizamos Circle para instanciar Shape, ya que Shape es abstracta.
    }

    @Test
    void testConstructorDefault() {
        // Verificar que el constructor por defecto de Shape asigna los valores correctos
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }


    @Test
    void testGetColor() {
        // Verificar que el método getColor devuelve correctamente el color
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    void testIsFilled() {
        // Verificar que el método isFilled devuelve correctamente si está lleno o no
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testSetColor() {
        // Verificar que el método setColor cambia correctamente el color
        shape.setColor("yellow");
        assertEquals("yellow", shape.getColor());
    }

    @Test
    void testSetFilled() {
        // Verificar que el método setFilled cambia correctamente el estado de lleno
        shape.setFilled(true);
        assertTrue(shape.isFilled());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta del objeto Shape
        shape.setColor("blue");
        shape.setFilled(false);
        String expectedString = "Circle[Shape[color=blue,filled=false]radius=5.0]";
        assertEquals(expectedString, shape.toString());
    }

    @Test
    void testGetArea() {
        // Verificar que el método getArea retorna el área correcta para un círculo
        shape = new Circle(5.0);  // Reinicializamos con un círculo de radio 5
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, shape.getArea());
    }

    @Test
    void testGetPerimeter() {
        // Verificar que el método getPerimeter retorna el perímetro correcto para un círculo
        shape = new Circle(5.0);  // Reinicializamos con un círculo de radio 5
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, shape.getPerimeter());
    }
}
