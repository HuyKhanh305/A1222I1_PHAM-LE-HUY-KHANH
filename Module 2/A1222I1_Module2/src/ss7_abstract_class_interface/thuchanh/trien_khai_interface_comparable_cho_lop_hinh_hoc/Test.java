package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparable_cho_lop_hinh_hoc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[1] = new ComparableCircle();
        circles[0] = new ComparableCircle(3.5,"red",false);
        circles[2] = new ComparableCircle(3.4);

        System.out.println("Mang truoc khi sap xep:");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Mang sau khi sap xep:");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
