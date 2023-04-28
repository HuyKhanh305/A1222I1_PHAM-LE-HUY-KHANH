package ss13_thuat_toan_tim_kiem.baitap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String input = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()){
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character value: max) {
            System.out.print(value);
        }
        System.out.println();
    }
}
