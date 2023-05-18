package ss15_xu_ly_ngoai_le_va_debug.thuchanh.su_dung_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert x");
        int x = scanner.nextInt();
        System.out.println("Insert y");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calc(x,y);
    }

    private void calc(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong X + Y= "+a);
            System.out.println("Hieu X - Y= "+b);
            System.out.println("Tich X * Y= "+c);
            System.out.println("Thuong X / Y= "+d);
        } catch (Exception e){
            System.out.println("Exception:"+ e.getMessage());
        }
    }
}
