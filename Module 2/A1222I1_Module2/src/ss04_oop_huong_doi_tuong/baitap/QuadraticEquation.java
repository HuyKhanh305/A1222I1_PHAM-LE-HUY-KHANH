package ss04_oop_huong_doi_tuong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private final double A, B, C;

    public QuadraticEquation(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    double delta;

    public double getDiscriminant() {
        return delta = (B * B - 4 * A * C);
    }


    public String giaiPhuongTrinh() {
        String kq = "";
        if (A == 0 || B == 0) {
            System.out.println("Phuong trinh bac 2 nhap a khac 0");
        } else {
            if (getDiscriminant() < 0) {
                kq += "Phuong trinh vo nghiem ";
            } else if (getDiscriminant() == 0) {
                kq += "Phuong trinh co 1 nghiem kep la: " + "x1 = x2 = " + (-B / (2 * A));
            } else {
                kq += "Phuong trinh co 2 nghiem la: " + "x1= " + getRoot1() + " ,x2= " + getRoot2();
            }
        }
        return kq;
    }

    public double getRoot1() {
        return (-B + Math.sqrt(delta)) / (2 * A);
    }

    public double getRoot2() {
        return (-B - Math.sqrt(delta)) / (2 * A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap vao gia tri a");
        a = sc.nextDouble();
        System.out.println("Nhap vao gia tri b");
        b = sc.nextDouble();
        System.out.println("Nhap vao gia tri c");
        c = sc.nextDouble();

        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        System.out.print(pt1.giaiPhuongTrinh());
    }
}

