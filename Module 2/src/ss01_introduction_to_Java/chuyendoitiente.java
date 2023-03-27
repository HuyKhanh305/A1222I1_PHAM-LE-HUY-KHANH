package ss01_introduction_to_Java;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        final double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tien USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("So tien VND la "+ quydoi);
    }
}
