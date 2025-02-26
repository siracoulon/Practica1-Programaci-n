package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    /** Constructor principal establece valores por defecto */
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    /** Segundo constructor dados length y width */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    /** Constructor dados length width y los atributos de la
     * superclase Shape color y filled*/
    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    /** Getter para length */
    public double getLength() {
        return length;
    }
    /** Setter para length */
    public void setLength(double length) {
        this.length = length;
    }
    /** Getter para width */
    public double getWidth() {
        return width;
    }
    /** Setter para width */
    public void setWidth(double width) {
        this.width = width;
    }
    /** Getter para area */
    @Override
    public double getArea() {
        return length * width;
    }
    /** Getter para perimeter */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    /** toString */
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "length=" + length + ",width=" + width + "]";
    }
}
