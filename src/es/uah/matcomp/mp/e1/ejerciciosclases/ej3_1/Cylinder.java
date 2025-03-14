package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_1;

public class Cylinder extends Circle{
    private double height;
    public Cylinder () {
        super();
        height = 1.0;
    }
    public Cylinder (double height){
        super();
        this.height = height;
    }
    public Cylinder (double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;

    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getArea(){
        return 2*Math.PI*getRadius()*height+2*super.getArea();
    }
    @Override
    public String toString(){
        return "Cylinder: subclass of "+super.toString()+"height: "+height;
    }
}

