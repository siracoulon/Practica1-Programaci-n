package es.uah.matcomp.mp.e1.ejerciciosclases.ej2_6_7_8;

public class TestMyLine {
    public static void main(String[] args) {
        // Crear puntos para probar MyPoint
        MyPoint p1 = new MyPoint(2,7);
        MyPoint p2 = new MyPoint(3,5);

        System.out.println("Mi primer punto es: "+ p1);
        System.out.println("Mi segundo punto es: "+ p2);

        System.out.printf("%.2f\n", p1.distance(p2));
        // Crear linea para probar MyLine
        MyLine line = new MyLine(p1,p2);

        // Probar el toString
        System.out.println(line);

        // Probar getters
        System.out.println(line.getBegin());
        System.out.println(line.getEnd());

        //Modificar los puntos de inicio y fin
        line.setBegin(p2);
        line.setEnd(p1);
        System.out.println(line);

        // Probar getters y setters por coordenadas
        System.out.println(line.getBeginX());
        System.out.println(line.getEndY());
        line.setBeginX(9);
        line.setEndY(10);
        System.out.println(line);

        //Para ambas simultaneamente
        int[] coordenadas = line.getBeginXY();
        String result = "("+coordenadas[0]+","+coordenadas[1]+")";
        System.out.println(result);
        line.setEndXY(10,20);
        System.out.println(line);

        //Probar longitud y gradiente
        System.out.println(line.getLength());
        System.out.println(line.getGradient());
    }
}
