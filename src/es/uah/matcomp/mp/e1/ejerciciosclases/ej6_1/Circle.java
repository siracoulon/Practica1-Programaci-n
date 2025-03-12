package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1.Shape;

public class Circle extends Shape {
    protected double radius;

    /**Primer constructor, valores por defecto*/
    public Circle() {
        this.radius = 1.0;
    }
    /**Segundo constructor con radio dado*/
    public Circle(double radius) {
        this.radius = radius;
    }
    /**Getter*/
    public double getRadius() {
        return radius;
    }
    /**Setter*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**Getter para el Area*/
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    /**Devuelve el perímetro*/
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    /**toString*/
    @Override
    public String toString() {
        return "Circle["+ super.toString() + "radius=" + radius + "]";
    }
}
