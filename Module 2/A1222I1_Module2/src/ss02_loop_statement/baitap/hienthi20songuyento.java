package ss02_loop_statement.baitap;

import java.util.Scanner;

public class hienthi20songuyento {
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrime(N)) {
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}