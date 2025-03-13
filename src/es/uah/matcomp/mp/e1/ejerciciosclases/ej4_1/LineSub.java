package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

public class LineSub extends Point {
    // Necesita dos puntos: inicio y final
    private Point end;  // Punto final

    // Constructor con coordenadas
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);  // Se inicializa el punto de inicio
        this.end = new Point(endX, endY);  // Se inicializa el punto final
    }

    // Constructor con objetos Point
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY()); // Se inicializa el punto de inicio
        this.end = end;  // Se asigna el punto final
    }

    // Métodos públicos
    public Point getEnd() { return end; }
    public void setEnd(Point end) { this.end = end; }

    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }
    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    public double getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "LineSub: (" + getX() + "," + getY() + ") to " + end;
    }
}


