package ss7_abstract_class_interface.baitap.trien_khai_interface_colorable_cho_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Circle(3);
        arr[1] = new Rectangle();
        arr[2] = new Circle(4);
        arr[3] = new Rectangle();

        for (Shape index : arr) {
            if (index instanceof Colorable) {
                ((Colorable) index).howToColor();
            } else {
                System.out.println("Diện tích là: " +((Circle) index).getArea());
            }
        }
    }
}
