package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getBegin() {
        Line line = new Line(1, 2, 3, 4);
        Point begin = line.getBegin();
        assertEquals(1, begin.getX());
        assertEquals(2, begin.getY());
    }

    @Test
    void getEnd() {
        Line line = new Line(1, 2, 3, 4);
        Point end = line.getEnd();
        assertEquals(3, end.getX());
        assertEquals(4, end.getY());
    }

    @Test
    void setBegin() {
        Line line = new Line(1, 2, 3, 4);
        line.setBegin(new Point(5, 6));
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    void setEnd() {
        Line line = new Line(1, 2, 3, 4);
        line.setEnd(new Point(5, 6));
        assertEquals(5, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void getBeginX() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(4, line.getEndY());
    }

    @Test
    void setBeginX() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginX(7);
        assertEquals(7, line.getBeginX());
    }

    @Test
    void setBeginY() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginY(8);
        assertEquals(8, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginXY(9, 10);
        assertEquals(9, line.getBeginX());
        assertEquals(10, line.getBeginY());
    }

    @Test
    void setEndX() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void setEndY() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndY(8);
        assertEquals(8, line.getEndY());
    }

    @Test
    void setEndXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndXY(9, 10);
        assertEquals(9, line.getEndX());
        assertEquals(10, line.getEndY());
    }

    @Test
    void getLength() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(5.0, line.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        Line line = new Line(0, 0, 1, 1);
        assertEquals(Math.PI / 4, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals("Line: (1,2) to (3,4)", line.toString());
    }
}
