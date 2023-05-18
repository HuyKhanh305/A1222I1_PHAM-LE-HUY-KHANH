package ss17_io_binary_file_and_serialization.baitap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Menu implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("------Menu------");
        System.out.println("1. Display List");
        System.out.println("2. Add new product");
        System.out.println("3. Search product");
        System.out.println("4. Exit");
        System.out.println("Insert number to use");
        int select = sc.nextInt();
            switch (select){
                case 1:
                    ProductManager.displayList();
                    break;
                case 2:
                    ProductManager.addProduct();
                    break;
                case 3:
                    ProductManager.searchById();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
