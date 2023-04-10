package ss7_abstract_class_interface.baitap.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import java.util.concurrent.ThreadLocalRandom;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();

        System.out.println("Diện tích các hình ban đầu là: ");
        for (Shape value: arr) {
            double kq = 0;
            if (value instanceof Circle) {
                kq += ((Circle) value).getArea();
            } else if (value instanceof Rectangle) {
                kq += ((Rectangle) value).getArea();
            } else {
                kq += ((Square) value).getArea();
            }
            System.out.println(kq);
        }


        int randomInt = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Tỷ lệ phần trăm kích thước là: "+randomInt);
        System.out.println("Các hình thay đổi kích thước như sau: ");
        for (Shape index: arr) {
            if (index instanceof Resizeable) {
                Resizeable resizeable = (Resizeable) index;
                resizeable.resize(randomInt);
            }
        }
    }
}
