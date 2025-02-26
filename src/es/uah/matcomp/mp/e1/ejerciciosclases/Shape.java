package es.uah.matcomp.mp.e1.ejerciciosclases;

abstract class Shape {
    protected String color;
    protected boolean filled;
    /** Constructor por defecto*/
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    /** Construye una figura dados color y condicion de lleno*/
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    /** Devuelve el color de una figura*/
    public String getColor() {
        return color;
    }
    /** Modifica el color */
    public void setColor(String color) {
        this.color = color;
    }
    /** Devuelve si la figura está llena o no*/
    public boolean isFilled() {
        return filled;
    }
    /** Modifica el estado de la figura (llena o no)*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
