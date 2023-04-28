package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository.IProductRepository;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository.ProductRepository;

public class ProductService implements IProductService {

    private IProductRepository repository = new ProductRepository();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void addProduct() {
        repository.addProduct();
    }

    @Override
    public void deleteProduct() {
        repository.deleteProduct();
    }

    @Override
    public void searchProduct() {
        repository.searchProduct();
    }

    @Override
    public void updateProduct() {
        repository.updateProduct();
    }

    @Override
    public void sortPriceUp() {
        repository.sortPriceUp();
    }

    @Override
    public void sortPriceDown() {
        repository.sortPriceDown();
    }
}
