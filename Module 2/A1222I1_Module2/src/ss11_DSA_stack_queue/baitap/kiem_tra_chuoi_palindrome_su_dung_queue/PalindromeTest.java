package ss11_DSA_stack_queue.baitap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra:");
        String str = scanner.nextLine();
        String input = str.toUpperCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = (input.length()-1) ; i >= 0 ; i--) {
            queue.add(input.charAt(i));
        }

        String reverse = "";
        while (!queue.isEmpty()){
             reverse = reverse + queue.remove();
        }

        if (input.equals(reverse)){
            System.out.println("Day la chuoi Palindrome");
        } else {
            System.out.println("Day khong phai la chuoi Palindrome");
        }
    }
}
