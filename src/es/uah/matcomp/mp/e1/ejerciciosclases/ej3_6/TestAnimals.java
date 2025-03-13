package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_6;
public class TestAnimals {
    public static void main(String[] args) {
        Animal a1 = new Animal("Generic Animal");
        System.out.println(a1);

        Mammal m1 = new Mammal("Generic Mammal");
        System.out.println(m1);

        Cat c1 = new Cat("Lua");
        System.out.println(c1);
        c1.greets();

        Dog d1 = new Dog("Rex");
        System.out.println(d1);
        d1.greets();

        Dog d2 = new Dog("Coco");
        d1.greets(d2);
    }
}


