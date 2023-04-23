package ss11_DSA_stack_queue.thuchanh.trien_khai_queue_su_dung_mang;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        if (currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if (currentSize == 0){
            return true;
        }
        return false;
    }

    public void enQueue(int item){
        if (isQueueFull()){
            System.out.println("Overflow");
        } else {
            tail++;
            if (tail == capacity){
                tail = 0;
            }
        }
        queueArr[tail] = item;
        currentSize++;
        System.out.println("Add element "+ item + " to Queue");
    }

    public void deQueue(){
        if (isQueueEmpty()){
            System.out.println("Nothing to dequeue");
        } else {
            head++;
            if (head == capacity){
                head =0;
            }
            System.out.println("Removed "+ queueArr[head-1]);
        }
        currentSize--;
    }

    public void displayQueue(){
        if (isQueueFull()){
            for (int i = 0; i < queueArr.length; i++) {
                System.out.println(queueArr[i]);
            }
        }
    }
}
