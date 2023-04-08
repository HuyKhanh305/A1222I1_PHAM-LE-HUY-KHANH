package ss6_ke_thua.baitap.loppoint2dvaloppoint3d;

public class Point3d extends Point2d {
    float z;

    public Point3d(){}

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        return new float[]{super.x,super.y,this.z};
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
