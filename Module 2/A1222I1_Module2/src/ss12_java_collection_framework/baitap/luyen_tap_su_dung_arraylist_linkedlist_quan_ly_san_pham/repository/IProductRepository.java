package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.model.Product;

import java.util.ArrayList;

public interface IProductRepository {

    Product[] display();

    void addProduct();

    void deleteProduct(int id);

    void searchProduct(String name);

    void sortProduct(int price);
}
