package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_4;
public class MovablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[]getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    @Override
    public String toString() {
        return super.toString()+",speed= ("+xSpeed+","+ySpeed+")";

    }
    public MovablePoint move(float x, float y) {
        return new MovablePoint(x, y,xSpeed,ySpeed);
    }
}
