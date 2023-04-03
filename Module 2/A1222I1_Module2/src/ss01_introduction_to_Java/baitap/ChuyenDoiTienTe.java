package ss01_introduction_to_Java.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tien USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("So tien VND la "+ quyDoi);
    }
}
