package es.uah.matcomp.mp.e1.ejerciciosclases.ej3_3;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;

    }
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    public float getZ() {
        return z;

    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

}

