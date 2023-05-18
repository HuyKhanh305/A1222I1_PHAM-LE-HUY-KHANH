package ss16_io_text_file.thuchanh.tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(filePath);
            BufferedReader buff = new BufferedReader(fileReader);
            String line;
            int sum = 0;
            while ((line = buff.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            buff.close();
            System.out.println("Tong = "+ sum);

        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan file");
        String path = sc.nextLine();

        readFile(path);
    }
}
