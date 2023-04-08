package ss6_ke_thua.baitap.loppointvamoveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        System.out.println(point1);

        MovablePoint m1 = new MovablePoint(2,4,3,2);
        m1.getSpeed();
        System.out.println(m1);
    }
}
