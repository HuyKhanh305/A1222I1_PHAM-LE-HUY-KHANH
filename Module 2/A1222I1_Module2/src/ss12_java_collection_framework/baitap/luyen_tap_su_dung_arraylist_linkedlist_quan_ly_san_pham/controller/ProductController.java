package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.controller;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.model.Product;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service.IProductService;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("---Product Manager---");
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

            switch (select){
                case 1:
                    Product[] productList = service.display();
                    for (Product product: productList) {
                        System.out.println(product);
                    }
                     break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
