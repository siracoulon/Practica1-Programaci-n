package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_1;

public class Square extends Rectangle {
    /** Constrcutor por defecto que llama a rectangle*/
    public Square(){
        super();
    }
    /** Constructor dado el lado que llama a rectangle*/
    public Square(double lado){
        super(lado, lado);
    }
    /** Constror dado lado que llama a Rectangle
     * y dados color y filled que llaman a Shape*/
    public Square(double lado, String color, boolean filled){
        super(lado, lado, color, filled);
    }
    /** Devuelve el lado*/
    public double getSide(){
        return getLength();
    }
    /** Modifica el lado*/
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
