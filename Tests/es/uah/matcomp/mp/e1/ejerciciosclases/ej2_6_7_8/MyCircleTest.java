package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    private MyCircle circle1;
    private MyCircle circle2;

    @BeforeEach
    void setUp() {
        // Configuración inicial para los tests
        circle1 = new MyCircle(new MyPoint(1, 2), 3);
        circle2 = new MyCircle(4, 5, 6);
    }

    @Test
    void testDefaultConstructor() {
        MyCircle defaultCircle = new MyCircle();
        assertEquals(0, defaultCircle.getCenterX());
        assertEquals(0, defaultCircle.getCenterY());
        assertEquals(1, defaultCircle.getRadius());
    }

    @Test
    void testParameterizedConstructorWithMyPoint() {
        assertEquals(1, circle1.getCenterX());
        assertEquals(2, circle1.getCenterY());
        assertEquals(3, circle1.getRadius());
    }

    @Test
    void testParameterizedConstructorWithCoordinates() {
        assertEquals(4, circle2.getCenterX());
        assertEquals(5, circle2.getCenterY());
        assertEquals(6, circle2.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = circle1.getCenter();
        assertEquals(1, center.getX());
        assertEquals(2, center.getY());
    }

    @Test
    void setCenter() {
        MyPoint newCenter = new MyPoint(7, 8);
        circle1.setCenter(newCenter);
        assertEquals(newCenter, circle1.getCenter());
    }

    @Test
    void getRadius() {
        assertEquals(3, circle1.getRadius());
    }

    @Test
    void setRadius() {
        circle1.setRadius(10);
        assertEquals(10, circle1.getRadius());
    }

    @Test
    void getCenterX() {
        assertEquals(1, circle1.getCenterX());
    }

    @Test
    void setCenterX() {
        circle1.setCenterX(9);
        assertEquals(9, circle1.getCenterX());
    }

    @Test
    void getCenterY() {
        assertEquals(2, circle1.getCenterY());
    }

    @Test
    void setCenterY() {
        circle1.setCenterY(10);
        assertEquals(10, circle1.getCenterY());
    }

    @Test
    void getCenterXY() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, circle1.getCenterXY());
    }

    @Test
    void setCenterXY() {
        circle1.setCenterXY(11, 12);
        assertEquals(11, circle1.getCenterX());
        assertEquals(12, circle1.getCenterY());
    }

    @Test
    void testToString() {
        String expected = "MyCircle[radius=3,(1,2)]";
        assertEquals(expected, circle1.toString());
    }

    @Test
    void getArea() {
        double expectedArea = Math.PI * 3 * 3;
        assertEquals(expectedArea, circle1.getArea(), 0.001);
    }

    @Test
    void getCircumference() {
        double expectedCircumference = 2 * Math.PI * 3;
        assertEquals(expectedCircumference, circle1.getCircumference(), 0.001);
    }

    @Test
    void distance() {
        MyCircle anotherCircle = new MyCircle(4, 5, 6);
        double expectedDistance = circle1.getCenter().distance(anotherCircle.getCenter());
        assertEquals(expectedDistance, circle1.distance(anotherCircle), 0.001);
    }
}