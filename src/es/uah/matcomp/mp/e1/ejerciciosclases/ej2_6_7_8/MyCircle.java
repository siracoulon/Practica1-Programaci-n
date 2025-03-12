package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

public class MyCircle {
    public MyPoint center;
    public int radius;
    /** Constructor por defecto */
    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    /** Constructor con parámetros*/
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    /** Constructor mediante x, y, radius*/
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    /** Getters y Setters para los atributos*/
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    /** Getters y Setters de Center por coordenadas */
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    /** Getters y Setters para las coordenadas de center simultaneamente*/
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    @Override
    public String toString() {
        return "MyCircle[" + "radius=" + radius + "," + center.toString() + ']';
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }


}
