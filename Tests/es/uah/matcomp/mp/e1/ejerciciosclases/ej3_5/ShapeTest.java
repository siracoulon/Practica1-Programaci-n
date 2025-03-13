package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Shape("green", true);
        assertEquals("green", shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape = new Shape("green", true);
        shape.setColor("yellow");
        assertEquals("yellow", shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape = new Shape("green", true);
        assertTrue(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape = new Shape("green", true);
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape = new Shape("green", false);
        assertEquals("Shape[color=green, filled=false]", shape.toString());
    }
}
