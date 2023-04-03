package ss04_oop_huong_doi_tuong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double delta;

    public double getDiscriminant() {
        return delta = (b * b - 4 * a * c);
    }


    public String giaiPhuongTrinh() {
        String kq = "";
        if (a == 0 || b == 0) {
            System.out.println("Phuong trinh bac 2 nhap a khac 0");
        } else {
            if (getDiscriminant() < 0) {
                kq += "Phuong trinh vo nghiem ";
            } else if (getDiscriminant() == 0) {
                kq += "Phuong trinh co 1 nghiem kep la: " + "x1 = x2 = " + (-b / (2 * a));
            } else {
                kq += "Phuong trinh co 2 nghiem la: " + "x1= " + getRoot1() + " ,x2= " + getRoot2();
            }
        }
        return kq;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(delta)) / (2 * a);
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

