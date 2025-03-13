package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_5;

public class TestShapes {
    public static void main(String[] args) {
        // Test de la clase Shape
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape1);
        System.out.println(shape2);
        shape1.setColor("green");
        shape1.setFilled(true);
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());

        // Test de la clase Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.0, "yellow", true);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        circle1.setRadius(4.5);
        System.out.println("Radio: " + circle1.getRadius());
        System.out.println("Área: " + circle1.getArea());
        System.out.println("Perímetro: " + circle1.getPerimeter());

        // Test de la clase Rectangle
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.0, 4.0);
        Rectangle rectangle3 = new Rectangle(3.5, 5.5, "red", false);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        rectangle1.setWidth(6.0);
        rectangle1.setLength(8.0);
        System.out.println("Ancho: " + rectangle1.getWidth());
        System.out.println("Largo: " + rectangle1.getLength());
        System.out.println("Área: " + rectangle1.getArea());
        System.out.println("Perímetro: " + rectangle1.getPerimeter());

        // Test de la clase Square
        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(6.0, "purple", true);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        square1.setSide(5.5);
        square1.setWidth(7.0);
        square1.setLength(7.0);
        System.out.println("Lado: " + square1.getSide());
        System.out.println("Ancho: " + square1.getWidth());
        System.out.println("Largo: " + square1.getLength());
        System.out.println("Área: " + square1.getArea());
        System.out.println("Perímetro: " + square1.getPerimeter());
    }
}

