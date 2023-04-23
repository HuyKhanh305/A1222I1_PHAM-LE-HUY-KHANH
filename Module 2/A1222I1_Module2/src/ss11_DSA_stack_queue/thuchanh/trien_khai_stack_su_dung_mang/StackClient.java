package ss11_DSA_stack_queue.thuchanh.trien_khai_stack_su_dung_mang;

public class StackClient {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(3);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(2);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop() + "\t");
        }
    }
}
