package ss03_mang_va_phuong_thuc_trong_java.baitap;

//import java.util.Arrays;
import java.util.Scanner;

public class gopmang {
    static int[] arr1 = new int[4];
    static int[] arr2 = new int[4];
    static int[] arr3 = new int[arr1.length + arr2.length];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Input number arr1[" + i + "] : ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Input number arr2[" + i + "] : ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int index = 0;
        for (int value : arr1) {
            arr3[index] = value;
            index++;
        }

        for (int value : arr2) {
            arr3[index] = value;
            index++;
        }

        for (int value : arr3) {
            System.out.print("Mảng 3 gộp lại gồm: "+ value + " ");
        }
//        System.out.print(Arrays.toString(arr3));
    }
}