package ss7_abstract_class_interface.baitap.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
