package ss6_ke_thua.baitap.lopcirclevalopcylinder;

public class Cylinder extends Circle {
    long height;

    public Cylinder() {
    }

    public Cylinder(long radius, String color,long height) {
        super(radius, color);
        this.height = height;
    }

    public void getVolume(){
        System.out.println("Volume is: "+Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
