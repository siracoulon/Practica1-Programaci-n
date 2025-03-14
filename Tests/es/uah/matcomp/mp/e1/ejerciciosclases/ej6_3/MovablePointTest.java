package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    private MovablePoint movablePoint;

    @BeforeEach
    void setUp() {
        // Inicializamos un objeto MovablePoint en la posición (0, 0) con velocidad (1, 1)
        movablePoint = new MovablePoint(0, 0, 1, 1);
    }
    @Test
    void testMoveUp() {
        // Mover el objeto hacia arriba (decrementando Y por ySpeed)
        movablePoint.moveUp();
        assertEquals(-1, movablePoint.getY(), "La posición Y debería ser -1 después de mover hacia arriba.");
    }

    @Test
    void testMoveDown() {
        // Mover el objeto hacia abajo (incrementando Y por ySpeed)
        movablePoint.moveDown();
        assertEquals(1, movablePoint.getY(), "La posición Y debería ser 1 después de mover hacia abajo.");
    }

    @Test
    void testMoveLeft() {
        // Mover el objeto hacia la izquierda (decrementando X por xSpeed)
        movablePoint.moveLeft();
        assertEquals(-1, movablePoint.getX(), "La posición X debería ser -1 después de mover hacia la izquierda.");
    }

    @Test
    void testMoveRight() {
        // Mover el objeto hacia la derecha (incrementando X por xSpeed)
        movablePoint.moveRight();
        assertEquals(1, movablePoint.getX(), "La posición X debería ser 1 después de mover hacia la derecha.");
    }
}
