package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {
    private Circle circle;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto Circle con un radio de 5.0
        circle = new Circle(5.0);
    }

    @Test
    public void testToString() {
        // Verifica que el método toString devuelve la cadena correcta
        assertEquals("Circle[radius=5.0]", circle.toString());
    }

    @Test
    public void testGetArea() {
        // Verifica que el área calculada es correcta (Área = π * radio^2)
        assertEquals(Math.PI * 5.0 * 5.0, circle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        // Verifica que el perímetro calculado es correcto (Perímetro = 2 * π * radio)
        assertEquals(2 * Math.PI * 5.0, circle.getPerimeter(), 0.0001);
    }
}
