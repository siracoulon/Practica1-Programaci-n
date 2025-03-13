package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(5.0);
        circle.setRadius(7.0);
        assertEquals(7.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(3.0);
        assertEquals(Math.PI * 9, circle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3.0, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(3.0, "red", true);
        assertEquals("Circle[Shape[color=red, filled=true], radius=3.0]", circle.toString());
    }
}