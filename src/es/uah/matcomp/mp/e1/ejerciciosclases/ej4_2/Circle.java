package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_2;

public class Circle {
    private double radius;
    private String color;


    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }


    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
