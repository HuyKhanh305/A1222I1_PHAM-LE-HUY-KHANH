package ss14_thuat_toan_sap_xep.baitap.minh_hoa_thuat_toan_sap_xep_chen;

public class SapXepChen {
    static void sapXepChen(int[] arr){
        int currentKey;
        int currentIndex;

        for (int i = 1; i < arr.length; i++) {
            currentKey = arr[i];
            currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > currentKey){
                arr[currentIndex] = arr[currentIndex -1];
                currentIndex--;
                System.out.println("\n"+"Di chuyen phan tu: "+ arr[currentIndex]);
            }
            if (currentIndex != i){
                System.out.println("Chen phan tu: "+ currentKey + " ,tai vi tri: "+ currentIndex);
                arr[currentIndex] = currentKey;
            }
            System.out.println( "\n"+"Vong lap thu "+ i);
            display(arr);
        }
    }

    static void display(int[] arr){
        for (int value: arr) {
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{3,1,15,7,22,9};
        System.out.println("Mang ban dau:");
        display(list);
        System.out.println("----------------");
        sapXepChen(list);
    }
}
