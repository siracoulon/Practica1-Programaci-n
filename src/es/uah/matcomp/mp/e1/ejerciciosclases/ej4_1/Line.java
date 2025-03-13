package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

// Clase Line que usa composición con dos objetos Point
public class Line {
    // La línea se compone de dos puntos
    private Point begin;  // Punto inicial
    private Point end;    // Punto final

    // Constructor con dos objetos Point
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor con coordenadas enteras
    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    // Métodos públicos
    public Point getBegin() { return begin; }
    public Point getEnd() { return end; }
    public void setBegin(Point begin) { this.begin = begin; }
    public void setEnd(Point end) { this.end = end; }

    public int getBeginX() { return begin.getX(); }
    public int getBeginY() { return begin.getY(); }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int x) { begin.setX(x); }
    public void setBeginY(int y) { begin.setY(y); }
    public void setBeginXY(int x, int y) { begin.setXY(x, y); }
    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    // Método para calcular la longitud de la línea
    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Método para calcular el gradiente de la línea en radianes
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Line: " + begin + " to " + end;
    }
}
