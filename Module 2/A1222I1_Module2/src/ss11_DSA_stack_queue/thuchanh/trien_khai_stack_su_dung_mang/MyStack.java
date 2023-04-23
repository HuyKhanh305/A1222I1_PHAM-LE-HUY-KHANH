package ss11_DSA_stack_queue.thuchanh.trien_khai_stack_su_dung_mang;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is null");
        }
        return arr[--index];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        arr[index] = element;
        index++;
    }
}
