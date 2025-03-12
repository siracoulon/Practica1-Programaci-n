package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    private Ball ball;

    @BeforeEach
    void setUp() {
        // Inicializar el objeto Ball antes de cada test
        ball = new Ball(0.0f, 0.0f, 5, 1.0f, 1.0f);
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals(0.0f, ball.getX());
        assertEquals(0.0f, ball.getY());
        assertEquals(5, ball.getRadius());
        assertEquals(1.0f, ball.getXDelta());
        assertEquals(1.0f, ball.getYDelta());
    }

    @Test
    void testMove() {
        // Verificar que el método move() actualice correctamente las posiciones
        ball.move();
        assertEquals(1.0f, ball.getX()); // xDelta = 1.0
        assertEquals(1.0f, ball.getY()); // yDelta = 1.0
    }

    @Test
    void testReflectHorizontal() {
        // Verificar que el método reflectHorizontal() invierta la dirección de xDelta
        ball.reflectHorizontal();
        assertEquals(-1.0f, ball.getXDelta());
    }

    @Test
    void testReflectVertical() {
        // Verificar que el método reflectVertical() invierta la dirección de yDelta
        ball.reflectVertical();
        assertEquals(-1.0f, ball.getYDelta());
    }

    @Test
    void testToString() {
        // Verificar que el método toString() devuelve la representación correcta
        ball.setX(2.0f);
        ball.setY(3.0f);
        ball.setXDelta(1.5f);
        ball.setYDelta(2.5f);
        String expected = "Ball[(2.0,3.0),speed=(1.5,2.5)]";
        assertEquals(expected, ball.toString());
    }

    @Test
    void testMultipleMoves() {
        // Verificar que múltiples movimientos actualicen las posiciones correctamente
        ball.move();
        ball.move();
        assertEquals(2.0f, ball.getX()); // 1.0 + 1.0 + 1.0
        assertEquals(2.0f, ball.getY()); // 1.0 + 1.0 + 1.0
    }
}
