package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PointTest {

    @Test
    void getX() {
        Point point = new Point(3, 4);
        assertEquals(3, point.getX());
    }

    @Test
    void getY() {
        Point point = new Point(3, 4);
        assertEquals(4, point.getY());
    }

    @Test
    void setX() {
        Point point = new Point(3, 4);
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void setY() {
        Point point = new Point(3, 4);
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void setXY() {
        Point point = new Point(3, 4);
        point.setXY(7, 8);
        assertEquals(7, point.getX());
        assertEquals(8, point.getY());
    }

    @Test
    void testToString() {
        Point point = new Point(3, 4);
        assertEquals("Point: (3,4)", point.toString());
    }
}
