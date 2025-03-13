package es.uah.matcomp.mp.e1.ejerciciosclases.ej4_2;

public class TestCylinder {
    public static void main(String[] args) {
        testCircle();
        testCylinder();
        System.out.println("Todas las pruebas pasaron exitosamente.");
    }

    static void testCircle() {
        Circle c1 = new Circle();
        assert c1.getRadius() == 1.0;
        assert c1.getColor().equals("red");

        Circle c2 = new Circle(2.5);
        assert c2.getRadius() == 2.5;
        assert c2.getColor().equals("red");

        Circle c3 = new Circle(3.5, "blue");
        assert c3.getRadius() == 3.5;
        assert c3.getColor().equals("blue");

        c1.setRadius(4.0);
        c1.setColor("green");
        assert c1.getRadius() == 4.0;
        assert c1.getColor().equals("green");

        c1.setRadius(2.0);
        assert c1.getArea() == Math.PI * 4;

        assert c1.toString().equals("Circle [radius=2.0, color=green]");
    }

    static void testCylinder() {
        Cylinder cy1 = new Cylinder();
        assert cy1.getRadius() == 1.0;
        assert cy1.getColor().equals("red");
        assert cy1.getHeight() == 1.0;

        Cylinder cy2 = new Cylinder(5.0);
        assert cy2.getRadius() == 1.0;
        assert cy2.getColor().equals("red");
        assert cy2.getHeight() == 5.0;

        Cylinder cy3 = new Cylinder(2.5, 6.0);
        assert cy3.getRadius() == 2.5;
        assert cy3.getColor().equals("red");
        assert cy3.getHeight() == 6.0;

        Cylinder cy4 = new Cylinder(3.0, 7.0, "yellow");
        assert cy4.getRadius() == 3.0;
        assert cy4.getColor().equals("yellow");
        assert cy4.getHeight() == 7.0;

        cy1.setRadius(5.0);
        cy1.setHeight(10.0);
        cy1.setColor("purple");
        assert cy1.getRadius() == 5.0;
        assert cy1.getHeight() == 10.0;
        assert cy1.getColor().equals("purple");

        cy1.setRadius(2.0);
        cy1.setHeight(5.0);
        assert cy1.getVolume() == Math.PI * 4 * 5;

        cy1.setRadius(3.0);
        cy1.setHeight(4.0);
        assert cy1.getArea() == 2 * Math.PI * 3 * 4 + 2 * Math.PI * 9;

        assert cy1.toString().equals("Cylinder: base=Circle [radius=3.0, color=purple], height=4.0");
    }
}

