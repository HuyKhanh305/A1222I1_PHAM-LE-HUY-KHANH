package ss11_DSA_stack_queue.baitap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (num != 0){
            int d = num %2;
            stack.push(d);
            num /= 2;
        }

        System.out.println("Binary value is: ");
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
