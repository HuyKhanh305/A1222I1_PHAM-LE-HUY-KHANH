package ss15_xu_ly_ngoai_le_va_debug.thuchanh.su_dung_lop_ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[50];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        Integer[] array = example.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap chi so cua phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so "+ x + " la "+ array[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot gioi han cua mang");
        }
    }
}
