package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_1;

public class TestLine {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);  // (x, y) = (1, 2)
        Point p2 = new Point(3, 4);  // (x, y) = (3, 4)
        Point p3 = new Point(5, 6);  // (x, y) = (5, 6)



        System.out.println("p1: " + p1);  // Point: (1,2)
        System.out.println("p2: " + p2);  // Point: (3,4)
        System.out.println("p3: " + p3);  // Point: (5,6)



        Line line1 = new Line(p1, p2);  // Constructor con objetos Point
        Line line2 = new Line(7, 8, 9, 10);  // Constructor con coordenadas



        System.out.println("line1: " + line1);  // Line: Point: (1,2) to Point: (3,4)
        System.out.println("line2: " + line2);  // Line: Point: (7,8) to Point: (9,10)


        System.out.println("Longitud de line1: " + line1.getLength());
        System.out.println("Gradiente de line1: " + line1.getGradient());
        System.out.println("Longitud de line2: " + line2.getLength());
        System.out.println("Gradiente de line2: " + line2.getGradient());


        System.out.println("Comienzo de line1: " + line1.getBegin());  // Point: (1,2)
        System.out.println("Final de line1: " + line1.getEnd());  // Point: (3,4)



        System.out.println("Comienzo de line1 (X): " + line1.getBeginX());  // 1
        System.out.println("Comienzo de line1 (Y): " + line1.getBeginY());  // 2
        System.out.println("Final de line1 (X): " + line1.getEndX());  // 3
        System.out.println("Final de line1 (Y): " + line1.getEndY());  // 4


        line1.setBegin(p2);
        line1.setEnd(p3);
        System.out.println("line1 después de cambios: " + line1);  // Line: Point: (3,4) to Point: (5,6)


        // Llamando nuevamente a los métodos getBeginX(), getBeginY(), getEndX(), getEndY() después de modificaciones
        System.out.println("Nuevo comienzo de line1 (X): " + line1.getBeginX());  // 3
        System.out.println("Nuevo comienzo de line1 (Y): " + line1.getBeginY());  // 4
        System.out.println("Nuevo final de line1 (X): " + line1.getEndX());  // 5
        System.out.println("Nuevo final de line1 (Y): " + line1.getEndY());  // 6


        line1.setBeginX(100);  // Cambiar X del punto de inicio
        line1.setBeginY(200);  // Cambiar Y del punto de inicio
        System.out.println("line1 con punto de inicio modificado: " + line1);  // Line: Point: (100,200) to Point: (5,6)


        line1.setEndX(300);  // Cambiar X del punto final
        line1.setEndY(400);  // Cambiar Y del punto final
        System.out.println("line1 con punto final modificado: " + line1);  // Line: Point: (100,200) to Point: (300,400)


        // **LLAMADAS A LOS NUEVOS MÉTODOS**
        // Usar setBeginXY y setEndXY para modificar las coordenadas
        line1.setBeginXY(10, 20);  // Cambiar X e Y del punto de inicio
        line1.setEndXY(30, 40);    // Cambiar X e Y del punto final
        System.out.println("line1 después de cambiar con setBeginXY y setEndXY: " + line1);  // Line: Point: (10,20) to Point: (30,40)


        // Crear una instancia de la clase LineSub usando el constructor con coordenadas
        LineSub lineSub1 = new LineSub(1, 2, 3, 4);  // Constructor con coordenadas
        LineSub lineSub2 = new LineSub(p1, p2);  // Constructor con objetos Point


        // Mostrar las representaciones en cadena de las líneas LineSub
        System.out.println("lineSub1: " + lineSub1);  // LineSub: (1,2) to Point: (3,4)
        System.out.println("lineSub2: " + lineSub2);  // LineSub: (30,40) to Point: (3,4)


        // Probar los métodos de LineSub
        System.out.println("Longitud de lineSub1: " + lineSub1.getLength());
        System.out.println("Gradiente de lineSub1: " + lineSub1.getGradient());
        System.out.println("Longitud de lineSub2: " + lineSub2.getLength());
        System.out.println("Gradiente de lineSub2: " + lineSub2.getGradient());


        // Probar los métodos getters y setters de LineSub
        System.out.println("Final de lineSub1: " + lineSub1.getEnd());  // Point: (3,4)
        System.out.println("Final de lineSub2: " + lineSub2.getEnd());  // Point: (3,4)


        lineSub1.setEndXY(6, 8);  // Cambiar el punto final de lineSub1
        System.out.println("lineSub1 después de cambiar el punto final: " + lineSub1);  // LineSub: (1,2) to Point: (6,8)


        lineSub1.setEndX(7);  // Cambiar X del punto final de lineSub1
        lineSub1.setEndY(9);  // Cambiar Y del punto final de lineSub1
        System.out.println("lineSub1 después de cambiar X e Y del punto final: " + lineSub1);  // LineSub: (1,2) to Point: (7,9)


        // Probar otros métodos de LineSub
        System.out.println("Longitud de lineSub1: " + lineSub1.getLength());  // Longitud después de modificar el final
        System.out.println("Gradiente de lineSub1: " + lineSub1.getGradient());  // Gradiente después de modificar el final


        // Llamando a setEnd, getEndX() y getEndY()
        line1.setEnd(new Point(50, 60));  // Usando setEnd para cambiar el punto final de la línea
        System.out.println("line1 después de setEnd: " + line1);  // Line: Point: (10,20) to Point: (50,60)
        System.out.println("Nuevo final de line1 (X): " + line1.getEndX());  // 50
        System.out.println("Nuevo final de line1 (Y): " + line1.getEndY());  // 60
    }
}
