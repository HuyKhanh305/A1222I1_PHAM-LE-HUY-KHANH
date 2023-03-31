package ss03_mang_va_phuong_thuc_trong_java.baitap;

//import java.util.Scanner;

public class tinhTongCacSoTrongMotCot_Mang2Chieu {
    public static void main(String[] args) {
        int[][] array = {
                {1, 8, 2},
                {3, 5, 4},
                {6, 7, 2}
        };
        findSum(array);
    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so luong cot cua mang 2 chieu");
//        int cot = sc.nextInt();
//        System.out.println("Nhap vao so luong hang cua mang 2 chieu");
//        int hang = sc.nextInt();
//        int[][] arr = new int[cot][hang];
//        System.out.println("Nhap vao gia tri cua mang 2 chieu");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        findSum();
//    }


    public static void findSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][j];
            }
        }
//        return sum;
        System.out.println(sum);
    }
}
