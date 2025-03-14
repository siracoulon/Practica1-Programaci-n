package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovablePointTest {

    @Test
    public void testConstructorWithParameters() {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertEquals(1.0f, point.getX(), 0.0001);
        assertEquals(2.0f, point.getY(), 0.0001);
        assertArrayEquals(new float[]{0.5f, 0.5f}, point.getSpeed(), 0.0001f);
    }

    @Test
    public void testGetSpeed() {
        MovablePoint point = new MovablePoint(3.0f, 4.0f, 1.0f, 1.5f);
        assertArrayEquals(new float[]{1.0f, 1.5f}, point.getSpeed(), 0.0001f);
    }

    @Test
    public void testMove() {
        MovablePoint point = new MovablePoint(2.0f, 3.0f, 0.2f, 0.3f);
        MovablePoint movedPoint = point.move(4.0f, 5.0f);
        assertEquals(4.0f, movedPoint.getX(), 0.0001);
        assertEquals(5.0f, movedPoint.getY(), 0.0001);
        assertArrayEquals(new float[]{0.2f, 0.3f}, movedPoint.getSpeed(), 0.0001f);
    }

    @Test
    public void testToString() {
        MovablePoint point = new MovablePoint(6.0f, 7.0f, 1.2f, 1.8f);
        String expectedString = "(6.0, 7.0),speed= (1.2,1.8)";
        assertEquals(expectedString, point.toString());
    }
}
