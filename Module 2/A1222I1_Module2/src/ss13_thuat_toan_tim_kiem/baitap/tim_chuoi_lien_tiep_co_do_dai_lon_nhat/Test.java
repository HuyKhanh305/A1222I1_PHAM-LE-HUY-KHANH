package ss13_thuat_toan_tim_kiem.baitap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String input = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast() && list.contains(input.charAt(i))){
                list.clear();
            }
            list.add(input.charAt(i));
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for (Character value: max) {
            System.out.print(value);
        }
        System.out.println();
    }
}
