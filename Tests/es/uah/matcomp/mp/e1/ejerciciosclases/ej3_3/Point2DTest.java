package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Point2DTest {

    @Test
    public void testConstructorWithParameters() {
        Point2D point = new Point2D(1.5f, 2.5f);
        assertEquals(1.5f, point.getX(), 0.0001);
        assertEquals(2.5f, point.getY(), 0.0001);
    }

    @Test
    public void testConstructorDefault() {
        Point2D point = new Point2D();
        assertEquals(0.0f, point.getX(), 0.0001);
        assertEquals(0.0f, point.getY(), 0.0001);
    }

    @Test
    public void testSetX() {
        Point2D point = new Point2D();
        point.setX(3.3f);
        assertEquals(3.3f, point.getX(), 0.0001);
    }

    @Test
    public void testSetY() {
        Point2D point = new Point2D();
        point.setY(4.4f);
        assertEquals(4.4f, point.getY(), 0.0001);
    }

    @Test
    public void testSetXY() {
        Point2D point = new Point2D();
        point.setXY(5.5f, 6.6f);
        assertArrayEquals(new float[]{5.5f, 6.6f}, point.getXY(), 0.0001f);
    }

    @Test
    public void testToString() {
        Point2D point = new Point2D(7.7f, 8.8f);
        String expectedString = "(7.7, 8.8)";
        assertEquals(expectedString, point.toString());
    }
}


