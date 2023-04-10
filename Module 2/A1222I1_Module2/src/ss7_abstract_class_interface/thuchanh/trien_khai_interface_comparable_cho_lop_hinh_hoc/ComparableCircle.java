package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparable_cho_lop_hinh_hoc;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle c) {
        if (getRadius() > c.getRadius()){
            return 1;
        } else if (getRadius() < c.getRadius()){
            return -1;
        } else {
            return 1;
        }
    }
}
