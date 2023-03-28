package ss01_introduction_to_Java.baitap;

import java.util.Scanner;

public class helloname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello" + name);
    }
}
