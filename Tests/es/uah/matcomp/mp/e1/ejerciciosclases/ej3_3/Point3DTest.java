package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Point3DTest {

    @Test
    public void testConstructorWithParameters() {
        Point3D point = new Point3D(1.0f, 2.0f, 3.0f);
        assertEquals(1.0f, point.getX(), 0.0001);
        assertEquals(2.0f, point.getY(), 0.0001);
        assertEquals(3.0f, point.getZ(), 0.0001);
    }

    @Test
    public void testConstructorDefault() {
        Point3D point = new Point3D();
        assertEquals(0.0f, point.getX(), 0.0001);
        assertEquals(0.0f, point.getY(), 0.0001);
        assertEquals(0.0f, point.getZ(), 0.0001);
    }

    @Test
    public void testSetZ() {
        Point3D point = new Point3D();
        point.setZ(5.5f);
        assertEquals(5.5f, point.getZ(), 0.0001);
    }

    @Test
    public void testSetXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(4.0f, 5.0f, 6.0f);
        assertArrayEquals(new float[]{4.0f, 5.0f, 6.0f}, point.getXYZ(), 0.0001f);
    }

    @Test
    public void testToString() {
        Point3D point = new Point3D(1.1f, 2.2f, 3.3f);
        String expectedString = "(1.1, 2.2, 3.3)";
        assertEquals(expectedString, point.toString());
    }
}

