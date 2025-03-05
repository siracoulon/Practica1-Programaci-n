package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_5;

public class ResizableCircle extends Circle {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString() {
        return "ResizableCircle[" + super.toString() +"]";
    }
    public void resize(int percent){
        radius *= percent/100.0;
    }

}
