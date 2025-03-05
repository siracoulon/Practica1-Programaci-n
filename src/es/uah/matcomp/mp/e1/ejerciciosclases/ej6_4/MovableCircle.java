package es.uah.matcomp.mp.e1.ejerciciosclases.ej6_4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public String toString(){
        return "(" + center.x + ", " + center.y + "), " + "speed=(" + center.xSpeed + ", " + center.ySpeed + "), " + "radius=" + radius;
    }
}
