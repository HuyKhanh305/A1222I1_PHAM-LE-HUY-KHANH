package ss11_DSA_stack_queue.baitap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketByStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot bieu thuc de kiem tra");
        String input = sc.nextLine();
        Boolean kq = checkBracket(input);
        System.out.println(kq);
    }

    public static boolean checkBracket(String sym) {
        String[] arr = sym.split("");
        Stack<String> bStack = new Stack<>();

        for (String s : arr) {
            if (s.equals("(")) {
                bStack.add(sym);
            } else if (s.equals(")")) {
                if (bStack.isEmpty()) return false;
                else {
                    String left = bStack.peek();
                    if (left.equals(sym)) {
                        bStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return bStack.empty();
    }
}
