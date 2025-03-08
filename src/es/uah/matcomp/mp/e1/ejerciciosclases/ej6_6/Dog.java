package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_6;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog another){
        System.out.println("Woooooooooof!");
    }
}
