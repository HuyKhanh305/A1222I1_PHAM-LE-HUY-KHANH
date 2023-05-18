package ss15_xu_ly_ngoai_le_va_debug.baitap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IllegalTriangleException {
        boolean isTriangle = false;
        int a,b,c;
        while (!isTriangle) {
            try {
                System.out.println("Nhap vao canh a");
                a = scanner.nextInt();
                System.out.println("Nhap vao canh b");
                b = scanner.nextInt();
                System.out.println("Nhap vao canh c");
                c = scanner.nextInt();

                if (a < 0 || b < 0 || c < 0) {
                    throw new ArithmeticException();
                }

                if (a + b < c) {
                    throw new IllegalTriangleException("Khong hop le");
                } else if (a + c < b) {
                    throw new IllegalTriangleException("Khong hop le");
                } else if (b + c < a) {
                    throw new IllegalTriangleException("Khong hop le");
                } else {
                    isTriangle = true;
                }
            } catch (IllegalTriangleException e) {
                System.out.println("Tong 2 canh phai lon hon canh con lai");
                System.out.println("Moi nhap lai");
            } catch (ArithmeticException e) {
                System.out.println("Canh tam giac phai la so duong");
                System.out.println("Moi nhap lai");
            }
        }
    }
}
