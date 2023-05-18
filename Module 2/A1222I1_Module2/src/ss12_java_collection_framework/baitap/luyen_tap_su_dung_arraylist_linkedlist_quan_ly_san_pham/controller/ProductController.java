package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.controller;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service.IProductService;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        OUT: do {
            System.out.println("---Menu---");
            System.out.println("1. Display");
            System.out.println("2. Add ");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search Product");
            System.out.println("6. Sort by Price Up ");
            System.out.println("7. Sort by Price Down ");
            System.out.println("8. Exit");
            System.out.print("Please input number ");
            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addProduct();
                    break;
                case 3:
                    service.updateProduct();
                    break;
                case 4:
                    service.deleteProduct();
                    break;
                case 5:
                    service.searchProduct();
                    break;
                case 6:
                    service.sortPriceUp();
                    break;
                case 7:
                    service.sortPriceDown();
                    break;
                case 8:
                    break OUT;
            }
        } while (true);
    }
}
