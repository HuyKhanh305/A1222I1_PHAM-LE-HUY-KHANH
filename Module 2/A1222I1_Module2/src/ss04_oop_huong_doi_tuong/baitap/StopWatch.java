package ss04_oop_huong_doi_tuong.baitap;

import java.time.LocalTime;
import java.util.Calendar;

public class StopWatch {
private final long startTime = Calendar.getInstance().getTimeInMillis();
private final long endTime = Calendar.getInstance().getTimeInMillis();

    public long getStart() {
        return startTime;
    }

    public long getEnd() {
        return endTime;
    }

    public LocalTime startTime(){
        return java.time.LocalTime.now();
    }

    public long start(){
        return System.currentTimeMillis();
    }
    public long end(){
        return System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return end() - start();
    }

    public void selectionSort(int[] arr){
        start();
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for (int value : arr) {
            System.out.print(arr[value]);
        }
        end();
        }

    public static void main(String[] args) {
        StopWatch watch1 = new StopWatch();
        System.out.println(watch1.startTime());
        int[] array = {65,35,50,78,40,21,30,55,25};
        watch1.selectionSort(array);
        long kq = watch1.getElapsedTime();
        System.out.println(kq);
    }
}

