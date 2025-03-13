package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AnimalTest {

    @Test
    void testToString() {
        Animal animal = new Animal("Tiger");
        assertEquals("Animal[name=Tiger]", animal.toString());
    }

}
