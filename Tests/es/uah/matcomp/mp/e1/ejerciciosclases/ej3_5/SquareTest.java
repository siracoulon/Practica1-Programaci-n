package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square(4.0);
        assertEquals(4.0, square.getSide());
    }

    @Test
    void setSide() {
        Square square = new Square(4.0);
        square.setSide(5.0);
        assertEquals(5.0, square.getSide());
    }

    @Test
    void setWidth() {
        Square square = new Square(4.0);
        square.setWidth(6.0);
        assertEquals(6.0, square.getSide());
    }

    @Test
    void setLength() {
        Square square = new Square(4.0);
        square.setLength(7.0);
        assertEquals(7.0, square.getSide());
    }

    @Test
    void testToString() {
        Square square = new Square(3.0, "red", true);
        assertEquals("Square[Rectangle[Shape[color=red, filled=true], width=3.0, length=3.0]]", square.toString());
    }
}
