package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.0001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testConstructorWithRadius() {
        Circle circle = new Circle(2.5);
        assertEquals(2.5, circle.getRadius(), 0.0001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testConstructorWithRadiusAndColor() {
        Circle circle = new Circle(3.5, "blue");
        assertEquals(3.5, circle.getRadius(), 0.0001);
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.2);
        assertEquals(4.2, circle.getRadius(), 0.0001);
    }

    @Test
    public void testSetColor() {
        Circle circle = new Circle();
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle(2.0);
        assertEquals(4.0 * Math.PI, circle.getArea(), 0.0001);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(2.5, "yellow");
        assertEquals("Circle [radius=2.5, color=yellow]", circle.toString());
    }
}
