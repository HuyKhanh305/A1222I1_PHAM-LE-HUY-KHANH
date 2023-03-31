package ss03_mang_va_phuong_thuc_trong_java.baitap;


import java.util.Scanner;

public class demSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hellocodegym";
        System.out.println("Chuoi: " +str);
        System.out.println("Nhap ky tu muon kiem tra");
        char kyTu = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (kyTu == str.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+kyTu+" la "+count);
    }
}