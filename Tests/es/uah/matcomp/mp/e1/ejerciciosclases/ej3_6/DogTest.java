package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Rex");
        dog.greets(); // Se espera que imprima "Woof"
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2); // Se espera que imprima "Woooof"
    }

    @Test
    void testToString() {
        Dog dog = new Dog("Rex");
        assertEquals("Dog[Animal[name=Rex]]", dog.toString());
    }
}
