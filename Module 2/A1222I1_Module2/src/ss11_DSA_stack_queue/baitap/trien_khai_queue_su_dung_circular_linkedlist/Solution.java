package ss11_DSA_stack_queue.baitap.trien_khai_queue_su_dung_circular_linkedlist;


public class Solution {

    static class Queue{
        public Node front;
        public Node rear;
    }
    static class Node {
         int data;
         Node link;
    }

    static void enQueue(Queue q,int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null){
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    static void deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("null");;
        } else {
            int value;
            if (queue.front == queue.rear) {
                value = queue.front.data;
                queue.front= queue.rear = null;
            } else {
                Node temp = queue.front;
                value = temp.data;
               queue.front = queue.front.link;
               queue.rear.link = queue.front;
            }
            System.out.print("\nDeleted value = "+value);
        }
    }

    static void displayQueue(Queue q){
       Node temp = q.front;
        System.out.print("Elements in Queue is: ");
        while (temp.link != q.front){
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.rear = q.front = null;
        enQueue(q,5);
        enQueue(q,3);
        enQueue(q,9);
        enQueue(q,7);

        displayQueue(q);

        deQueue(q);
        deQueue(q);

        System.out.println("\n------------------");
        displayQueue(q);
    }
}





