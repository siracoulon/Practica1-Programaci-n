package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal mammal = new Mammal("Charlie");
        assertEquals("Mammal[Animal[name=Charlie]]", mammal.toString());
    }
}