package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LineSubTest {

    @Test
    void getEnd() {
        LineSub line = new LineSub(1, 2, 3, 4);
        Point end = line.getEnd();
        assertEquals(3, end.getX());
        assertEquals(4, end.getY());
    }

    @Test
    void setEnd() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEnd(new Point(5, 6));
        assertEquals(5, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void getEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(4, line.getEndY());
    }

    @Test
    void setEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void setEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndY(8);
        assertEquals(8, line.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndXY(9, 10);
        assertEquals(9, line.getEndX());
        assertEquals(10, line.getEndY());
    }

    @Test
    void getLength() {
        LineSub line = new LineSub(0, 0, 3, 4);
        assertEquals(5.0, line.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        LineSub line = new LineSub(0, 0, 1, 1);
        assertEquals(Math.PI / 4, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals("LineSub: (1,2) to (3,4)", line.toString());
    }
}