package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Whiskers");
        cat.greets(); // Se espera que imprima "Meow"
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Cat[Animal[name=Whiskers]]", cat.toString());
    }
}
