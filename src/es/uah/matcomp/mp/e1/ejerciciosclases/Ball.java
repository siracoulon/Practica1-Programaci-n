package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    /** Constructor principal dados x,y, radius, xDelta, yDelta */
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    /** Getter y Setter para x */
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    /** Getter y Setter para y */
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    /** Getter y Setter para Radius */
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    /** Getter y Setter para xDelta */
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    /** Getter y Setter para yDelta */
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    /** Método para cambiar posición */
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    /** Método para invertir horizontalmente */
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    /** Método para invertir verticalmente */
    public void reflectVertical(){
        yDelta = -yDelta;
    }
    /** toString */
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
