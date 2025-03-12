package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovableCircleTest {
    private MovableCircle movableCircle;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto MovableCircle con coordenadas (1, 2), velocidad (1, 1), y radio 5
        movableCircle = new MovableCircle(1, 2, 1, 1, 5);
    }

    @Test
    public void testMoveUp() {
        movableCircle.moveUp();
        // Verifica la nueva posición después de mover hacia arriba (y se decrementa por la velocidad)
        assertEquals("(1, 1), speed=(1, 1), radius=5", movableCircle.toString());
    }

    @Test
    public void testMoveDown() {
        movableCircle.moveDown();
        // Verifica la nueva posición después de mover hacia abajo (y se incrementa por la velocidad)
        assertEquals("(1, 3), speed=(1, 1), radius=5", movableCircle.toString());
    }

    @Test
    public void testMoveLeft() {
        movableCircle.moveLeft();
        // Verifica la nueva posición después de mover hacia la izquierda (x se decrementa por la velocidad)
        assertEquals("(0, 2), speed=(1, 1), radius=5", movableCircle.toString());
    }

    @Test
    public void testMoveRight() {
        movableCircle.moveRight();
        // Verifica la nueva posición después de mover hacia la derecha (x se incrementa por la velocidad)
        assertEquals("(2, 2), speed=(1, 1), radius=5", movableCircle.toString());
    }
}
