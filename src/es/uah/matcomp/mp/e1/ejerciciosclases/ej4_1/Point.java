package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

public class Point {
    // Variables privadas
    private int x;  // Coordenada X
    private int y;  // Coordenada Y

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos públicos
    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }
}
