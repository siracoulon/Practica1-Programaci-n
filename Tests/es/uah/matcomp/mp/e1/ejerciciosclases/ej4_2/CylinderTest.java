package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CylinderTest {

    @Test
    void getRadius() {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        assertEquals(5.0, cylinder.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(4.5);
        assertEquals(4.5, cylinder.getRadius(), 0.001);
    }

    @Test
    void getColor() {
        Cylinder cylinder = new Cylinder(3.0, 7.0, "blue");
        assertEquals("blue", cylinder.getColor());
    }

    @Test
    void setColor() {
        Cylinder cylinder = new Cylinder();
        cylinder.setColor("green");
        assertEquals("green", cylinder.getColor());
    }

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder(8.0);
        assertEquals(8.0, cylinder.getHeight(), 0.001);
    }

    @Test
    void setHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(6.5);
        assertEquals(6.5, cylinder.getHeight(), 0.001);
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        assertEquals(Math.PI * 3.0 * 3.0 * 5.0, cylinder.getVolume(), 0.001);
    }

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder(2.0, 4.0);
        assertEquals(2 * Math.PI * 2.0 * 4.0 + 2 * Math.PI * 2.0 * 2.0, cylinder.getArea(), 0.001);
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(3.0, 5.0, "yellow");
        assertEquals("Cylinder: base=Circle [radius=3.0, color=yellow], height=5.0", cylinder.toString());
    }
}