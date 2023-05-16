package ss17_io_binary_file_and_serialization.baitap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Serializable {

    public static final String FILE_PATH = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss17_io_binary_file_and_serialization\\baitap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\ProductStore.dat";

    static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1,"Iphone","Apple",5000);
        Product product2 = new Product(2,"Nokia","Microsoft",2000);
        Product product3 = new Product(3,"Galaxy","Samsung",8000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }
    public static List<Product> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> list = (List<Product>) ois.readObject();
        ois.close();
        return list;
    }

    public static void writeFile(List<Product> products) throws IOException {
        FileOutputStream fis = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(products);
        oos.close();
    }

    public static void addProduct() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap san pham vao");
        System.out.println("Nhap id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String brand = scanner.nextLine();
        System.out.println("Nhap gia tien san pham");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(id,name,brand,price);
        productList.add(newProduct);
        System.out.println("Đã thêm sản phẩm thành công");
        System.out.println(newProduct);
    }

    public static void searchById() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can tim kiem");
        int id = Integer.parseInt(scanner.nextLine());

        for (Product product : productList) {
            if (id == product.getId()) {
                System.out.println(product);
            }
        }
    }
    public static void displayList() throws IOException, ClassNotFoundException {
        writeFile(productList);
        List<Product> result = readFile();
        for (Product product: result) {
            System.out.println(product);
        }
    }
}
