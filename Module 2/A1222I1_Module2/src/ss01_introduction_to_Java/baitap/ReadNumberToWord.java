package ss01_introduction_to_Java.baitap;

import java.util.Scanner;

public class ReadNumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String kq = "";
        do {
            System.out.println("Enter number");
            num = sc.nextInt();
        } while (num < 0 || num > 999);
        int tram = num / 100;
        int chuc = (num % 100) / 10;
        int donvi = (num % 100) % 10;

        switch (tram) {
            case 1:
                kq += "một trăm";
                break;
            case 2:
                kq += "Hai trăm";
                break;
            case 3:
                kq += "Ba trăm";
                break;
            case 4:
                kq += "Bốn trăm";
                break;
            case 5:
                kq += "Năm trăm";
                break;
            case 6:
                kq += "Sáu trăm";
                break;
            case 7:
                kq += "Bảy trăm";
                break;
            case 8:
                kq += "Tám trăm";
                break;
            case 9:
                kq += "Chín trăm";
                break;
        }

        switch (chuc){
            case 0:
                if (donvi == 0) {
                    kq += " chẵn";
                } else {
                    kq += " lẻ";
                }
                break;
            case 1:
                kq += " mười";
                break;
            case 2:
                kq += " hai mươi";
                break;
            case 3:
                kq += " ba mươi";
                break;
            case 4:
                kq += " bốn mươi";
                break;
            case 5:
                kq += " năm mươi";
                break;
            case 6:
                kq += " sáu mươi";
                break;
            case 7:
                kq += " bảy mươi";
                break;
            case 8:
                kq += " tám mươi";
                break;
            case 9:
                kq += " chín muơi";
                break;
        }

        switch (donvi){
            case 1:
                kq += " một";
                break;
            case 2:
                kq += " hai";
                break;
            case 3:
                kq += " ba";
                break;
            case 4:
                kq += " bốn";
                break;
            case 5:
                kq += " năm";
                break;
            case 6:
                kq += " sáu";
                break;
            case 7:
                kq += " bảy";
                break;
            case 8:
                kq += " tám";
                break;
            case 9:
                kq += " chín";
                break;
        }
        System.out.println(kq);
    }
    }
