package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class mang2Chieu_TinhTongDuongCheo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] daySo = new int[3][3];
        System.out.println("Nhap gia tri cua mang 2 chieu");
        for (int i = 0; i < daySo.length; i++) {
            for (int j = 0; j < daySo[i].length; j++) {
                daySo[i][j] = scanner.nextInt();
            }
        }

        int kq = findSum(daySo);
        System.out.println(kq);
    }

    static int findSum(int [][] arr){
        int [][] array = {
                {1,3,2},
                {2,1,5},
                {3,2,4}
        };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][i];
            }
        }
        return sum;
    }
}
