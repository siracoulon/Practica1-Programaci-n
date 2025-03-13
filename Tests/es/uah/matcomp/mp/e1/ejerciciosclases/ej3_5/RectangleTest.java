package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(4.0, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.setWidth(6.0);
        assertEquals(6.0, rectangle.getWidth());
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(5.0, rectangle.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.setLength(7.0);
        assertEquals(7.0, rectangle.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(20.0, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(18.0, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, "blue", false);
        assertEquals("Rectangle[Shape[color=blue, filled=false], width=4.0, length=5.0]", rectangle.toString());
    }
}
