package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.model.Product;

public class ProductRepository implements IProductRepository {

    private static Product[] productList;
    private static int size = 0;

    static {
        productList = new Product[10];
        productList[0] = new Product(1,"Áo Polo",250000);
        productList[1] = new Product(2,"Áo Khoác",500000);
        productList[2] = new Product(3,"Áo Mưa",10000);
        productList[3] = new Product(4,"Áo Dài",990000);
        size = 4;
    }
    @Override
    public Product[] display() {
        Product[] products = new Product[size];
        System.arraycopy(productList, 0, products, 0, size);
        return products;
    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public void searchProduct(String name) {

    }

    @Override
    public void sortProduct(int price) {

    }
}
