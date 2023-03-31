package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class themphantuvaomang {
    static int[] arr = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number arr[" + i + "] : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap so can chen");
        int x = sc.nextInt();
        System.out.println("Nhap vao vi tri can chen");
        int index = sc.nextInt();
        if (index > 0 && index <= (arr.length - 1)) {
            for (int j = arr.length - 1; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = x;
        } else {
            System.out.println("Khong chen duoc vao mang");
        }
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}