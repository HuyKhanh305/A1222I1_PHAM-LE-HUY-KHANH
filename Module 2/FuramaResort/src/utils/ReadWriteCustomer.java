package utils;

import model.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteCustomer {
    public static final String CUSTOMER_PATH = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\FuramaResort\\src\\data\\Customer.csv";
    static List<Customer> customerList = new LinkedList<>();

    public static List<Customer> readFile() throws IOException {
        FileReader fileReader = new FileReader(CUSTOMER_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Customer customer;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[1];
            String name = temp[2];
            String gender = temp[3];
            String card = temp[4];
            String phoneNumber = temp[5];
            String mail = temp[6];
            String customerType = temp[7];
            String address = temp[8];
            customer = new Customer(id, name, gender, card, phoneNumber, mail, customerType, address);
            customerList.add(customer);
        }
        buff.close();
        return customerList;
    }

    public static void writeFile(List<Customer> list) throws IOException {
        FileWriter fileWriter = new FileWriter(CUSTOMER_PATH,true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (Customer customers: list) {
            buff.write(customers.toString());
            buff.newLine();
            buff.flush();
        }
        buff.close();
    }
}
