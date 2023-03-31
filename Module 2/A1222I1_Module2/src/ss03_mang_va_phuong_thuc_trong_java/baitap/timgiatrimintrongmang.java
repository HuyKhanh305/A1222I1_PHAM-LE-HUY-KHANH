package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class timgiatrimintrongmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua mang");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhap vao gia tri cua mang");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la: "+min);
    }
}
