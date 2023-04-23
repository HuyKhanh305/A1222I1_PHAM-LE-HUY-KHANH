package ss11_DSA_stack_queue.thuchanh.trien_khai_queue_su_dung_linkedlist;

public class LinkedListQueueTest {
    public static void main(String[] args) {
        MyLinkedListQueue listQueue = new MyLinkedListQueue();
        listQueue.enqueue(5);
        listQueue.enqueue(7);
        listQueue.dequeue();
        listQueue.enqueue(2);
        listQueue.enqueue(3);
        listQueue.dequeue();
        listQueue.enqueue(9);
        listQueue.enqueue(10);
        System.out.println("Dequeue item is: "+ listQueue.dequeue().key);
    }
}
