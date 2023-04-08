package ss04_oop_huong_doi_tuong.baitap;

import java.time.LocalTime;
public class StopWatch {
private long startTime;
private long endTime;

    public long getStart() {
        return startTime;
    }

    public long getEnd() {
        return endTime;
    }

    public LocalTime startTime(){
        return java.time.LocalTime.now();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return (endTime - startTime);
    }

    public void selectionSort(long[] arr){
        long min = arr[0];
        start();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = j;
                }
            }
            long temp = min;
            min = arr[i];
            arr[i] = temp;
        }

//        for (long value : arr) {
//            System.out.print(value);
//        }
        end();
        }

    public static void main(String[] args) {
        StopWatch watch1 = new StopWatch();
        long[] array = new long[100000];
        System.out.println(watch1.startTime());
        watch1.selectionSort(array);
        long kq = watch1.getElapsedTime();
        System.out.println("Thời gian tính toán là: "+ kq + " mls");
    }
}

