package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResizableCircleTest {
    private ResizableCircle resizableCircle;

    @BeforeEach
    public void setUp() {
        // Inicializa el objeto ResizableCircle con un radio de 5.0
        resizableCircle = new ResizableCircle(5.0);
    }

    @Test
    public void testToString() {
        // Verifica que el método toString devuelve la cadena correcta
        assertEquals("ResizableCircle[Circle[radius=5.0]]", resizableCircle.toString());
    }

    @Test
    public void testResize() {
        // Redimensiona el círculo al 50% de su tamaño original
        resizableCircle.resize(50);
        // Verifica que el radio se ha reducido al 50% (5.0 * 50% = 2.5)
        assertEquals(2.5, resizableCircle.radius, 0.0001);

        // Redimensiona el círculo al 200% de su tamaño original
        resizableCircle.resize(200);
        // Verifica que el radio se ha duplicado (2.5 * 200% = 5.0)
        assertEquals(5.0, resizableCircle.radius, 0.0001);
    }

    @Test
    public void testGetArea() {
        // Verifica que el área calculada es correcta después de redimensionar (Área = π * radio^2)
        resizableCircle.resize(50);
        assertEquals(Math.PI * 2.5 * 2.5, resizableCircle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        // Verifica que el perímetro calculado es correcto después de redimensionar (Perímetro = 2 * π * radio)
        resizableCircle.resize(50);
        assertEquals(2 * Math.PI * 2.5, resizableCircle.getPerimeter(), 0.0001);
    }
}
