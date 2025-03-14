package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    public void testConstructorDefault() {
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getRadius(), 0.0001);
        assertEquals(1.0, cylinder.getHeight(), 0.0001);
    }

    @Test
    public void testConstructorConAltura() {
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(1.0, cylinder.getRadius(), 0.0001);
        assertEquals(5.0, cylinder.getHeight(), 0.0001);
    }

    @Test
    public void testConstructorConRadioYAltura() {
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        assertEquals(3.0, cylinder.getRadius(), 0.0001);
        assertEquals(7.0, cylinder.getHeight(), 0.0001);
    }

    @Test
    public void testGetVolume() {
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        double expectedVolume = Math.PI * 3.0 * 3.0 * 7.0;
        assertEquals(expectedVolume, cylinder.getVolume(), 0.0001);
    }

    @Test
    public void testGetArea() {
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        double expectedArea = 2 * Math.PI * 3.0 * 7.0 + 2 * (Math.PI * 3.0 * 3.0);
        assertEquals(expectedArea, cylinder.getArea(), 0.0001);
    }

    @Test
    public void testToString() {
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        String expectedString = "Cylinder: subclass of Circle [radius=3.0, color=red]height: 7.0";
        assertEquals(expectedString, cylinder.toString());
    }
}
