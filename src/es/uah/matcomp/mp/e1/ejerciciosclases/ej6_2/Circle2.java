package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_2;

public class Circle2 implements GeometricObject {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
