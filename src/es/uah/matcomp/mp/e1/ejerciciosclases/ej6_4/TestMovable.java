package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_4;

public class TestMovable {
    public static void main(String[] args) {
        // Pruebas del MovablePoint
        MovablePoint p1 = new MovablePoint(20, 30, 50, 60);
        System.out.println("Estado inicial" + p1);

        p1.moveLeft();
        System.out.println("Tras hacer moveLeft " + p1);

        p1.moveRight();
        System.out.println("Tras hacer moveRight" + p1);

        p1.moveUp();
        System.out.println("Tras hacer moveUp" + p1);

        p1.moveDown();
        System.out.println("Tras hacer moveDown" + p1);



        // Pruebas del MovableCircle
        MovableCircle c1 = new MovableCircle(5, 5, 2, 2, 10);
        // Estado inicial
        System.out.println(c1);
        // Estado después de hacer moveLeft
        c1.moveLeft();
        System.out.println("Tras hacer moveLeft" + c1);
        // Estado después de hacer moveRight
        c1.moveRight();
        System.out.println("Tras hacer moveRight" + c1);
        // Estado después de hacer moveUp
        c1.moveUp();
        System.out.println("Tras hacer moveUp" + c1);
        // Estado después de hacer moveDown
        c1.moveDown();
        System.out.println("Tras hacer moveDown" + c1);
    }
}
