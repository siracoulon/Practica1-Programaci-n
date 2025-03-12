package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    private Time time;

    @BeforeEach
    void setUp() {
        // Inicializamos el objeto Time antes de cada test
        time = new Time(10, 30, 45); // hora, minuto y segundo iniciales
    }

    @Test
    void testConstructor() {
        // Verificar que el constructor inicializa correctamente los atributos
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(45, time.getSecond());
    }

    @Test
    void testGetters() {
        // Verificar que los getters devuelven los valores correctos
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(45, time.getSecond());
    }

    @Test
    void testSetters() {
        // Verificar que los setters actualizan correctamente los valores
        time.setHour(12);
        time.setMinute(15);
        time.setSecond(30);

        assertEquals(12, time.getHour());
        assertEquals(15, time.getMinute());
        assertEquals(30, time.getSecond());
    }

    @Test
    void testSetTime() {
        // Verificar que el método setTime() actualiza correctamente los atributos
        time.setTime(23, 59, 59);
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());
    }

    @Test
    void testToString() {
        // Verificar que el método toString() devuelve la representación correcta de la hora
        String expected = "10:30:45";
        assertEquals(expected, time.toString());
    }

    @Test
    void testNextSecond() {
        // Verificar que el método nextSecond() funciona correctamente
        time.nextSecond();
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(46, time.getSecond());

        // Test con un cambio de minuto
        time.setTime(10, 59, 59);
        time.nextSecond();
        assertEquals(11, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());

        // Test con un cambio de hora
        time.setTime(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    void testPreviousSecond() {
        // Verificar que el método previousSecond() funciona correctamente
        time.previousSecond();
        assertEquals(10, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(44, time.getSecond());

        // Test con un cambio de minuto
        time.setTime(10, 0, 0);
        time.previousSecond();
        assertEquals(9, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());

        // Test con un cambio de hora
        time.setTime(0, 0, 0);
        time.previousSecond();
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());
    }
}
