package ss02_loop_statement.baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 1; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 4; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 4; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 0; i <= 4; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 4; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Nhap so dong");
                    int rows = input.nextInt();
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
