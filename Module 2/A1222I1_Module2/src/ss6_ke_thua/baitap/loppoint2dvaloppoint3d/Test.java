package ss6_ke_thua.baitap.loppoint2dvaloppoint3d;

public class Test {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(2,3);
        point2d.setX(4);
        point2d.setY(5);
        float[] arr = point2d.getXY();
        System.out.println("["+arr[0]+ "," + arr[1]+"]");
        System.out.println(point2d);

        Point3d point3d = new Point3d(3,4,5);
        point3d.setXYZ(5,2,7);
        float[] array = point3d.getXYZ();
        System.out.println("["+array[0]+","+array[1]+","+array[2]+"]");
        System.out.println(point3d);
    }
}
