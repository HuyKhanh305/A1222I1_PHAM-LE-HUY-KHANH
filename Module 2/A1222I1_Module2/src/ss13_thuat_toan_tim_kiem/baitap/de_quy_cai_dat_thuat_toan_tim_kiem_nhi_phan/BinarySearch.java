package ss13_thuat_toan_tim_kiem.baitap.de_quy_cai_dat_thuat_toan_tim_kiem_nhi_phan;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] array, int left, int right ,int value){
        int middle = (left+right)/2;

        while (left <= right) {
            if (array[middle] == value){
                return middle;
            } else if (value > array[middle]) {
                return left = middle + 1;
            } else {
                return right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang cua ban:");
        for (int value: arr) {
            System.out.print(value+" ");
        }

        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("\n"+"Mang sau khi sap xep:");
        for (int index : arr) {
            System.out.print(index +" ");
        }

        System.out.println(binarySearch(arr,arr[0],arr.length,20));
    }
}
