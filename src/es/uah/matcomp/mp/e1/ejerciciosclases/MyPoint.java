package es.uah.matcomp.mp.e1.ejerciciosclases;

import java.awt.*;

public class MyPoint {
    private int x;
    private int y;
    /** Constructor por defecto */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    /** Constructor por parametros */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /** Getters y Setters de los atributos y de su conjunto XY */
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[] {x,y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /** toString */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    /** distancia entre un punto y el que mando por parametros*/
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    /** distancia entre dos instancias de punto */
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.getX() - this.x, 2) + Math.pow(another.getY() - this.y, 2));
    }
    /** distancia entre un punto y el origen */
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
