package ss11_DSA_stack_queue.baitap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Binary Number To Convert:");
        // Cách 1:
        // String num = sc.nextLine();
        // System.out.println("Gia tri so thap phan la:"+ Integer.parseInt(num,2));

        //Cách 2:
        int num = sc.nextInt();
        Stack<Double> stack = new Stack<>();

        double decimal = 0;
        double soMu = 0;
        while (true){
            if (num == 0){
                break;
            } else {
                double temp = num %10;
                decimal += temp * Math.pow(2, soMu);
                stack.add(decimal);
                num /= 10;
                soMu++;
            }
        }

        System.out.println("Decimal is:");
        System.out.println(stack.pop());
    }
}
