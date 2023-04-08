package ss6_ke_thua.baitap.lopcirclevalopcylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"blue");
        System.out.println(circle);
        circle.getArea();

        Cylinder cylinder = new Cylinder(4,"red",4);
        System.out.println(cylinder);
        cylinder.getVolume();
    }
}
