package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_5;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(4.0);
        ResizableCircle c3 = new ResizableCircle(5.0);

        //toStrings
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Métodos de Circle
        double perimeter1 = c1.getPerimeter();
        System.out.printf("Perimeter 1: %.2f%n", perimeter1);
        double area2 = c2.getArea();
        System.out.printf("Area 2: %.2f%n" , area2);

        //Métodos de RezisableCircle
        c3.resize(40);
        System.out.println(c3);


        Circle c4 = new Circle(5.0);
        System.out.println(c4);



    }
}
