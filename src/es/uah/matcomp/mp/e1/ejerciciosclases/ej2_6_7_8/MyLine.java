package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    /** Constructor que inicializa la linea con dos puntos dados por sus coordenadas.
     * Crea automáticamente dos instancias MyPoint */
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    /** Constructor que inicializa la linea con dos objetos MyPoint dados */
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    /** Devuelve el punto de inicio de la linea */
    public MyPoint getBegin() {
        return begin;
    }
    /** Establece un nuevo punto de inicio */
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    /** Devuelve el punto final de la linea */
    public MyPoint getEnd() {
        return end;
    }
    /** Establece un nuevo punto final de la linea */
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    /** Devuelve la coordenada X del punto de inicio*/
    public int getBeginX() {
        return begin.getX();
    }
    /** Modifica la coordenada X del punto de inicio */
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    /** Devuelve la coordenada Y del punto de inicio */
    public int getBeginY() {
        return begin.getY();
    }
    /** Modifica la coordenada Y del punto de inicio */
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    /** Devuelve la coordenada X del punto final */
    public int getEndX() {
        return end.getX();
    }
    /** Modifica la coordenada X del punto final */
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    /** Devuelve la coordenada Y del punto final */
    public int getEndY() {
        return end.getY();
    }
    /** Modifica la coordenada Y del punto final */
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    /** Devuelve un array con las coordenadas (x,y) del punto de inicio */
    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    /** Modifica ambas coordenadas (x,y) del punto de inicio simultaneamente */
    public void setBeginXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }
    /** Devuelve un array con las coordenadas (x,y) del punto final */
    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    /** Modifica ambas coordenadas (x,y) del punto final simultaneamente */
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    /** Devulve la longitud utilizando el metodo para la distancia de MyPoint */
    public double getLength(){
        return this.begin.distance(this.end);
    }
    /** Devuelve el grado en radianes entre la linea y el eje x */
    public double getGradient(){
        return Math.atan2(this.end.getY() - this.begin.getY(), this.end.getX() - this.begin.getX());
    }
    /** toString */
    @Override
    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }


}
