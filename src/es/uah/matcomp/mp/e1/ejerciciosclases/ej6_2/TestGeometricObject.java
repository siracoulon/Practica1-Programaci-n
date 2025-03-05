package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_2;

public class TestGeometricObject {
    public static void main (String[] args) {
        Circle2 c1 = new Circle2(20);
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());


        Rectangle r1 = new Rectangle(10, 15);
        System.out.println(r1);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());

    }
}
