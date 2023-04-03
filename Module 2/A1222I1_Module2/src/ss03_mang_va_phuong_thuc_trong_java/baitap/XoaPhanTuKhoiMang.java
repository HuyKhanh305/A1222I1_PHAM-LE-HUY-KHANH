package ss03_mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    static int[] arr = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number arr[" + i + "] : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap phan tu can xoa");
        int x = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                 index += i;
                for (int j = index; j < arr.length -1 ; j++) {
                    arr[j] = arr[j + 1];
                }
                if (x == arr[arr.length-1]){
                    arr[arr.length-1] = 0;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
