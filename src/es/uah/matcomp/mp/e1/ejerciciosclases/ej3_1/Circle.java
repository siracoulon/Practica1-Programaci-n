package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_1;

public class Circle {
    private double radius;
    private String color;

    // Constructores     /** Constructs a Circle instance with default value for radius and color */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) {  // 2nd constructor
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public String getColor() {return color;
    }
    public void setColor(String newColor) {color = newColor;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {

        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

