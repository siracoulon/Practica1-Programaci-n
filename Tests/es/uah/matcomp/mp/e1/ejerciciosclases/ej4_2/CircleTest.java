package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(3.5);
        assertEquals(3.5, circle.getRadius(), 0.001);
    }

    @Test
    void getColor() {
        Circle circle = new Circle(4.0, "blue");
        assertEquals("blue", circle.getColor());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea(), 0.001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(3.0, "yellow");
        assertEquals("Circle [radius=3.0, color=yellow]", circle.toString());
    }
}