package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class mang2Chieu_TinhTongDuongCheo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang 2 chieu ");
        int size = scanner.nextInt();
        int[][] daySo = new int[size][];
        System.out.println("Nhap gia tri cua mang 2 chieu");
        for (int i = 0; i < daySo.length; i++) {
            daySo[i] = new int[size];
            for (int j = 0; j < daySo[i].length; j++) {
                daySo[i][j] = scanner.nextInt();
            }
        }
        for (int[] value: daySo) {
            for (int v : value) {
                System.out.print(v+" ");
            }
        }

        int sum = 0;
        for (int i = 0; i < daySo.length; i++) {
            sum += daySo[i][i];
        }
        System.out.println("Tong duong cheo la: " + sum);
    }
}