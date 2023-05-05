package ss14_thuat_toan_sap_xep.baitap.cai_dat_thuat_toan_sap_xep_chen;

public class SelectionSort {
    static void selectionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentValue = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > currentValue){
                list[j + 1] = list[j];
                j = j -1;
            }
            list[j + 1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,7,2,8,9,1,25,15};
        System.out.println("Mang ban dau:");
        for (int index : array) {
            System.out.print(index+" ");
        }

        selectionSort(array);

        System.out.println("\nMang da sap xep:");
        for (int value: array) {
            System.out.print(value+" ");
        }
    }
}
