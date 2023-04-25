package ss12_quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> productList = new ArrayList<>();

    static void add() {
        System.out.println("Nhap so luong san pham muon them");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ma san pham");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten san pham");
            String name = sc.nextLine();
            System.out.println("Nhap gia tien san pham");
            double price = Double.parseDouble(sc.nextLine());

            Product newProduct = new Product(id, name, price);
            productList.add(newProduct);
        }
    }

    static void delete() {
        System.out.println("Nhap id muon xoa");
        int input = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < productList.size(); i++) {
            if (input == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
    }

    static void update() {
        System.out.println("Nhap id muon cap nhat");
        int input = Integer.parseInt(sc.nextLine());

        for (Product product : productList) {
            if (input == product.getId()) {
                System.out.println("Nhap ma san pham moi");
                int newId = sc.nextInt();
                System.out.println("Nhap ten san pham moi");
                String newName = sc.nextLine();
                System.out.println("Nhap so tien moi");
                double newPrice = sc.nextDouble();
                product.setId(newId);
                product.setName(newName);
                product.setPrice(newPrice);
            }
        }
    }

    static void display() {
        for (Product sp : productList) {
            System.out.println(sp);
        }
    }

    static void search() {
        System.out.println("Nhap ten san pham can tim kiem");
        String name = sc.nextLine();

        for (Product sp : productList) {
            if (name.equals(sp.getName())) {
                System.out.println(sp);
            }
        }
    }

    static void sortToUpper() {
        Collections.sort(productList);
        display();
    }

    static void sortToDown() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        display();
    }

    public static void main(String[] args) {
        int select = 0;
        do {
            System.out.println("------Menu-------");
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("Nhap so chuc nang ban muon thuc hien");
            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    add();
                    display();
                    break;
                case 2:
                    delete();
                    display();
                    break;
                case 3:
                    update();
                    display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("Ban muon xem gia theo thu tu nao?");
                    System.out.println("1. Gia tang dan");
                    System.out.println("2. Gia giam dan");
                    int n = Integer.parseInt(sc.nextLine());
                    if (n == 1) {
                        sortToUpper();
                    } else {
                        sortToDown();
                    }
                    break;
            }
        } while (select > 0);
    }
}
