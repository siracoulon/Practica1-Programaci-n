package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square;

    @BeforeEach
    void setUp() {
        // Configuración inicial para los tests
        square = new Square(5.0, "red", true);
    }

    @Test
    void testDefaultConstructor() {
        Square defaultSquare = new Square();
        assertEquals(1.0, defaultSquare.getSide(), 0.001); // Asumiendo que Rectangle inicializa con 1.0
        assertEquals("red", defaultSquare.getColor()); // Asumiendo que Shape inicializa con "red"
        assertTrue(defaultSquare.isFilled()); // Asumiendo que Shape inicializa con filled=true
    }

    @Test
    void testConstructorWithSide() {
        Square sideSquare = new Square(3.0);
        assertEquals(3.0, sideSquare.getSide(), 0.001);
        assertEquals("red", sideSquare.getColor()); // Asumiendo que Shape inicializa con "red"
        assertTrue(sideSquare.isFilled()); // Asumiendo que Shape inicializa con filled=true
    }

    @Test
    void testConstructorWithSideColorAndFilled() {
        assertEquals(5.0, square.getSide(), 0.001);
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void getSide() {
        assertEquals(5.0, square.getSide(), 0.001);
    }

    @Test
    void setSide() {
        square.setSide(7.0);
        assertEquals(7.0, square.getSide(), 0.001);
        assertEquals(7.0, square.getWidth(), 0.001); // Verifica que el ancho también se actualiza
        assertEquals(7.0, square.getLength(), 0.001); // Verifica que el largo también se actualiza
    }

    @Test
    void setWidth() {
        square.setWidth(8.0);
        assertEquals(8.0, square.getSide(), 0.001); // Verifica que el lado se actualiza
        assertEquals(8.0, square.getWidth(), 0.001); // Verifica que el ancho se actualiza
        assertEquals(8.0, square.getLength(), 0.001); // Verifica que el largo se actualiza
    }

    @Test
    void setLength() {
        square.setLength(9.0);
        assertEquals(9.0, square.getSide(), 0.001); // Verifica que el lado se actualiza
        assertEquals(9.0, square.getWidth(), 0.001); // Verifica que el ancho se actualiza
        assertEquals(9.0, square.getLength(), 0.001); // Verifica que el largo se actualiza
    }

    @Test
    void testToString() {
        String expected = "Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0]]";
        assertEquals(expected, square.toString());
    }
}