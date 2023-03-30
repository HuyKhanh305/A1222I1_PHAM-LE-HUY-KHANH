package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class themphantuvaomang {
    static int[] arr = new int[10];

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
        if (index <= 1 && index >= (arr.length - 1)){
            System.out.println("Khong chen duoc vao mang");
        } else {
            for (int j = 0; j < arr.length ; j++) {
                arr[index] = x;
                arr[j+1] = index+1;
            }
        }
        for (int value : arr){
            System.out.println(value);
        }
    }
}