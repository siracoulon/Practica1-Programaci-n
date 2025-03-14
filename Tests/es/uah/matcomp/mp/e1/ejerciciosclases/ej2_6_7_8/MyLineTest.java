package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    private MyLine line;
    private MyPoint point1;
    private MyPoint point2;

    @BeforeEach
    void setUp() {
        // Inicializamos los puntos antes de cada test
        point1 = new MyPoint(1, 2);
        point2 = new MyPoint(4, 6);
        line = new MyLine(point1, point2);
    }

    @Test
    void testConstructorWithPoints() {
        // Verificar que el constructor que toma objetos MyPoint funciona correctamente
        assertEquals(point1, line.getBegin());
        assertEquals(point2, line.getEnd());
    }

    @Test
    void testConstructorWithCoordinates() {
        // Verificar que el constructor que toma coordenadas funciona correctamente
        MyLine line2 = new MyLine(1, 2, 4, 6);
        assertEquals(1, line2.getBeginX());
        assertEquals(2, line2.getBeginY());
        assertEquals(4, line2.getEndX());
        assertEquals(6, line2.getEndY());
    }

    @Test
    void testGetLength() {
        // Verificar que el método getLength devuelve la longitud correcta
        double expectedLength = point1.distance(point2);
        assertEquals(expectedLength, line.getLength());
    }

    @Test
    void testGetGradient() {
        // Verificar que el método getGradient devuelve el valor correcto
        double expectedGradient = Math.atan2(6 - 2, 4 - 1);
        assertEquals(expectedGradient, line.getGradient());
    }

    @Test
    void testGetBeginXY() {
        // Verificar que el método getBeginXY devuelve las coordenadas correctas del punto de inicio
        int[] expectedBeginXY = {1, 2};
        assertArrayEquals(expectedBeginXY, line.getBeginXY());
    }

    @Test
    void testGetEndXY() {
        // Verificar que el método getEndXY devuelve las coordenadas correctas del punto final
        int[] expectedEndXY = {4, 6};
        assertArrayEquals(expectedEndXY, line.getEndXY());
    }

    @Test
    void testSetBeginXY() {
        // Verificar que el método setBeginXY modifica correctamente las coordenadas del punto de inicio
        line.setBeginXY(7, 8);
        assertEquals(7, line.getBeginX());
        assertEquals(8, line.getBeginY());
    }

    @Test
    void testSetEndXY() {
        // Verificar que el método setEndXY modifica correctamente las coordenadas del punto final
        line.setEndXY(9, 10);
        assertEquals(9, line.getEndX());
        assertEquals(10, line.getEndY());
    }

    @Test
    void testToString() {
        // Verificar que el método toString devuelve la representación correcta de la línea
        String expectedString = "MyLine[begin=(1,2),end=(4,6)]";
        assertEquals(expectedString, line.toString());
    }
}
