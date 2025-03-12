package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovablePointTest {
    private MovablePoint movablePoint;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto MovablePoint con coordenadas (1, 2) y velocidad (1, 1)
        movablePoint = new MovablePoint(1, 2, 1, 1);
    }

    @Test
    public void testMoveUp() {
        movablePoint.moveUp();
        // Verifica la nueva posición después de mover hacia arriba (y se decrementa por la velocidad)
        assertEquals("(1, 1), speed=(1, 1)", movablePoint.toString());
    }

    @Test
    public void testMoveDown() {
        movablePoint.moveDown();
        // Verifica la nueva posición después de mover hacia abajo (y se incrementa por la velocidad)
        assertEquals("(1, 3), speed=(1, 1)", movablePoint.toString());
    }

    @Test
    public void testMoveLeft() {
        movablePoint.moveLeft();
        // Verifica la nueva posición después de mover hacia la izquierda (x se decrementa por la velocidad)
        assertEquals("(0, 2), speed=(1, 1)", movablePoint.toString());
    }

    @Test
    public void testMoveRight() {
        movablePoint.moveRight();
        // Verifica la nueva posición después de mover hacia la derecha (x se incrementa por la velocidad)
        assertEquals("(2, 2), speed=(1, 1)", movablePoint.toString());
    }
}
