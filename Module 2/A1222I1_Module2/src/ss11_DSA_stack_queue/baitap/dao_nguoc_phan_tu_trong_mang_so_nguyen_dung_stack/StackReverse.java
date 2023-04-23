package ss11_DSA_stack_queue.baitap.dao_nguoc_phan_tu_trong_mang_so_nguyen_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        System.out.println("-------1. Dao nguoc chuoi-----------------");
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhap vao chuoi: ");
        String str = scanner.nextLine();
        String[] mWord = str.split("");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }

        System.out.println("Chuoi dao nguoc: ");
        for (int i = 0; i < mWord.length; i++) {
            System.out.print(wStack.pop());
        }

        System.out.println("\n-------2. Dao nguoc phan tu mang-----------------");

        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhap so phan tu mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }

        System.out.println("Mang ban dau: ");
        for (int before : arr) {
            System.out.print(before + "");
        }

        for (int j = 0; j < n; j++) {
            arr[j] = stack.pop();
        }

        System.out.println("\nMang da bi dao nguoc: ");
        for (int reverse : arr) {
            System.out.print(reverse + "");
        }
    }
}
