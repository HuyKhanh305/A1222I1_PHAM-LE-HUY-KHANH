package ss7_abstract_class_interface.baitap.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);


    }
}
