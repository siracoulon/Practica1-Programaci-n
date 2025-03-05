package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej6_3.MovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(2,3,20,10);
        MovablePoint p2 = new MovablePoint(0,1,50,40);
        System.out.println(p1);
        System.out.println(p2);

        p1.moveRight();
        p2.moveLeft();
        System.out.println(p1);
        System.out.println(p2);

        p1.moveDown();
        p2.moveUp();
        System.out.println(p1);
        System.out.println(p2);


    }
}
