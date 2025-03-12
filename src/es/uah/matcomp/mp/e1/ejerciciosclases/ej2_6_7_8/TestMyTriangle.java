package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 9);
        MyPoint p2 = new MyPoint(2, 8);
        MyPoint p3 = new MyPoint(3, 7);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        System.out.println(t1);
        MyTriangle t2 = new MyTriangle(2,3,2,3,2,3);
        System.out.println(t2);

        System.out.println("Perimeter t1 = " + t1.getPerimeter());
        System.out.println("Perimeter t2 = " + t2.getPerimeter());
        System.out.println("Type t1: " + t1.getType());
        System.out.println("Type t2: " + t2.getType());
    }
}
