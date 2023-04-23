package ss11_DSA_stack_queue.thuchanh.trien_khai_queue_su_dung_linkedlist;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public static class Node{
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
        }
    }

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            head = tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        if (this.head == null){
            tail = null;
        }
        return temp;
    }
}
