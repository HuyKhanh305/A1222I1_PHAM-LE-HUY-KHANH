package ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.service;

import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.model.Product;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository.IProductRepository;
import ss12_java_collection_framework.baitap.luyen_tap_su_dung_arraylist_linkedlist_quan_ly_san_pham.repository.ProductRepository;

public class ProductService implements IProductService{

    private IProductRepository repository = new ProductRepository();

        @Override
        public Product[] display() {
            return repository.display();
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
