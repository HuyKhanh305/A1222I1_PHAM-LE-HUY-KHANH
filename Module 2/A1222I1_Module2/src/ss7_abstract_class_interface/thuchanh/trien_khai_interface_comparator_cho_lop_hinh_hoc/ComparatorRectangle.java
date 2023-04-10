package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparator_cho_lop_hinh_hoc;

import java.util.Comparator;

public class ComparatorRectangle implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getArea() > o2.getArea()){
            return 1;
        } else if (o1.getArea() < o2.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
