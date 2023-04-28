package ss13_thuat_toan_tim_kiem.thuchanh.khong_de_quy_cai_dat_thuat_toan_tim_kiem_nhi_phan;

public class BinarySearch {
    static int[] list = {2,4,7,8,10,15,22,25,30,47,50,58,68};

    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        while (high >= low){
            int mid = (low+high)/2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,15));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,47));
        System.out.println(binarySearch(list,70));
    }
}
