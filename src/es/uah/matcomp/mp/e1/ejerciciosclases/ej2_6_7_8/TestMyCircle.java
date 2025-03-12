package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1.Circle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);
        MyPoint p3 = new MyPoint(7, 9);

        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(p1,5);
        MyCircle c3 = new MyCircle(p2.getX(), p2.getY(), 7);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c2.setCenter(p3);
        c2.setRadius(8);
        System.out.println("Center c2:" + c2.getCenter());
        System.out.println("Radius c2:" + c2.getRadius());

        c3.setCenterX(p1.getX());
        c3.setCenterY(p1.getY());
        System.out.println("CenterX c3:" + c3.getCenterX());
        System.out.println("CenterY c3:" + c3.getCenterY());

        c1.setCenterXY(8,9);
        System.out.println("CenterXY c1: (" + c1.getCenterXY()[0] + ", " + c1.getCenterXY()[1] + ")");

        System.out.println("Area c1" + c1.getArea());
        System.out.println("Circumference c1:" + c1.getCircumference());
        System.out.println("Distance between c2 and c3: " + c2.distance(c3));
    }
}
