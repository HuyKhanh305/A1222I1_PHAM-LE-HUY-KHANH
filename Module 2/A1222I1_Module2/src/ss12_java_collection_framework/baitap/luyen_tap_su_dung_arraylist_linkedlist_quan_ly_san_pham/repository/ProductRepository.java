package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new LinkedList<>();


    static {
        Product sp1 = new Product(1, "Apple", 250000);
        Product sp2 = new Product(2, "Banana", 500000);
        Product sp3 = new Product(3, "Orange", 10000);
        Product sp4 = new Product(4, "Pineapple", 990000);
        productList.add(sp1);
        productList.add(sp2);
        productList.add(sp3);
        productList.add(sp4);
    }

    @Override
    public void display() {
        for (Product products: productList) {
            System.out.println(products);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Input quantity of product");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Insert product code");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Insert product name");
            String name = sc.nextLine();
            System.out.println("Insert product price");
            int price = Integer.parseInt(sc.nextLine());

            Product newProduct = new Product(id,name,price);
            productList.add(newProduct);
        }
        display();
    }

    @Override
    public void deleteProduct() {
        System.out.println("Insert product code to delete");
        int id = sc.nextInt();

        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()){
                productList.remove(i);
            }
        }
        display();
    }

    @Override
    public void searchProduct() {
        System.out.println("Insert product name to search");
        String name = sc.nextLine();

        for (Product sp: productList) {
            if (name.equals(sp.getName())){
                System.out.println(sp);
            }
        }
    }

    @Override
    public void updateProduct() {
        System.out.println("Insert product code to update");
        int num = Integer.parseInt(sc.nextLine());

        for (Product product : productList) {
            if (num == product.getId()) {
                System.out.println("Update product code");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Update product name");
                String name = sc.nextLine();
                System.out.println("Update product price");
                int price = Integer.parseInt(sc.nextLine());
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
            }
        }
        display();
    }

    @Override
    public void sortPriceUp() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        display();
    }

    @Override
    public void sortPriceDown() {
        Collections.sort(productList);
        display();
    }

}
