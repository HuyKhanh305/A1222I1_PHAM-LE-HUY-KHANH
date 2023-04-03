package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class TimPhanTuMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cot cua mang 2 chieu");
        int c = sc.nextInt();
        System.out.println("Nhap so luong dong cua mang 2 chieu");
        int r = sc.nextInt();
        int[][] arr = new int[c][r];
        System.out.println("Nhap vao gia tri trong mang 2 chieu");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int kq = findMax(arr);
        System.out.println("Phan tu lon nhat trong mang la: "+kq);
    }

    public static int findMax(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
