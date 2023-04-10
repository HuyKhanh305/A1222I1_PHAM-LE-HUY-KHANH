package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparator_cho_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparatorRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(3,5,"green",false);
        rectangles[2] = new Rectangle(2,3);

        System.out.println("Mang ban dau la: ");
        for (Rectangle value: rectangles) {
            System.out.println(value);
        }

        Comparator rectangleComparator = new ComparatorRectangle();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("Mang sau khi sap xep: ");
        for (Rectangle value: rectangles) {
            System.out.println(value);
        }
    }
}
