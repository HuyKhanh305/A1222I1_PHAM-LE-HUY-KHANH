package ss11_DSA_stack_queue.thuchanh.trien_khai_queue_su_dung_mang;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(9);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(8);
    }
}
