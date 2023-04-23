package ss11_DSA_stack_queue.baitap.dem_so_lan_xuat_hien_moi_tu_trong_chuoi_su_dung_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi:");
        String string = scanner.nextLine();
        String[] arr = string.split("");

        for (String s : arr) {
            String key = s.toLowerCase();
            if (treeMap.containsKey(key)) {
                Integer value = treeMap.get(key);
                value++;
                treeMap.replace(key, value);
            } else {
                treeMap.put(key, 1);
            }
        }

        System.out.println("------------------");
        System.out.println(treeMap);
    }
}
