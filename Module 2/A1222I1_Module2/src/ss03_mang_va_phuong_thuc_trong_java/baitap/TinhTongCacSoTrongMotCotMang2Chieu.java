package ss03_mang_va_phuong_thuc_trong_java.baitap;

//import java.util.Scanner;

import java.util.Scanner;

public class TinhTongCacSoTrongMotCotMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong cot cua mang 2 chieu");
        int cot = scanner.nextInt();
        System.out.println("Nhap vao so luong hang cua mang 2 chieu");
        int hang = scanner.nextInt();
        int[][] arr = new int[cot][hang];
        System.out.println("Nhap vao gia tri cua mang 2 chieu");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao cot muon tinh tong");
        int c = scanner.nextInt();
        findSum(arr, c);
    }



    public static void findSum(int[][] arr, int colum) {
        int[][] array = {
                {1, 8, 2},
                {3, 5, 4},
                {6, 7, 2}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j==colum){
                    sum += array[j][i];
                }
            }
        }
        System.out.println(sum);
    }
}
