package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_2;

public class Cylinder {
    private Circle base;  // Composición: Un cilindro tiene un círculo
    private double height;

    // Constructor por defecto
    public Cylinder() {
        this.base = new Circle();  // Se inicializa con un círculo por defecto
        this.height = 1.0;
    }

    // Constructor con altura
    public Cylinder(double height) {
        this.base = new Circle();
        this.height = height;
    }

    // Constructor con radio y altura
    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    // Constructor con radio, altura y color
    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    // Métodos Getters y Setters
    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Método para calcular el volumen del cilindro
    public double getVolume() {
        return base.getArea() * height;
    }

    // Método para calcular el área superficial del cilindro
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: base=" + base.toString() + ", height=" + height;
    }
}

