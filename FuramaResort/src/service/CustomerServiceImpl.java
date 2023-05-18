package service;

import model.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer(111, "Adam", "male", 423423, 45656, "gr54543@", "234 street", "Silver");
        Customer customer2 = new Customer(222, "Eva", "female", 4767645, 45653456, "gg45345f@", "233 street", "Silver");
        customerList.add(customer1);
        customerList.add(customer2);
    }

    @Override
    public void display() {
        for (Customer customers : customerList) {
            System.out.println(customers);
        }
    }

    @Override
    public void add() {
        System.out.println("Insert Customer Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert Customer name");
        String name = scanner.nextLine();
        System.out.println("Insert Customer gender");
        String sex = scanner.nextLine();
        System.out.println("Insert identity card");
        int cardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert phone number");
        long phoneNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Insert email");
        String mail = scanner.nextLine();
        System.out.println("Insert Customer address");
        String address = scanner.nextLine();
        System.out.println("Insert Customer type");
        String type = scanner.nextLine();
        Customer newCustomer = new Customer(id, name, sex, cardNumber, phoneNumber, mail, address, type);
        customerList.add(newCustomer);
        System.out.println("Add new customer: completed");
    }

    @Override
    public void edit() {
        System.out.println("Insert customer id to edit");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customers : customerList) {
            if (id == customers.getId()) {
                displayEditMenuCustomer();
                System.out.println("What you want to edit?");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Insert Customer name");
                        String name = scanner.nextLine();
                        customers.setName(name);
                        break;
                    case 2:
                        System.out.println("Insert Customer gender");
                        String sex = scanner.nextLine();
                        customers.setGender(sex);
                        break;
                    case 3:
                        System.out.println("Insert identity card");
                        int cardNumber = scanner.nextInt();
                        customers.setIdentityCard(cardNumber);
                        break;
                    case 4:
                        System.out.println("Insert phone number");
                        long phoneNumber = scanner.nextLong();
                        customers.setPhoneNumber(phoneNumber);
                        break;
                    case 5:
                        System.out.println("Insert email");
                        String mail = scanner.nextLine();
                        customers.setEmail(mail);
                        break;
                    case 6:
                        System.out.println("Insert Customer address");
                        String address = scanner.nextLine();
                        customers.setAddress(address);
                        break;
                    case 7:
                        System.out.println("Insert Customer type");
                        String type = scanner.nextLine();
                        customers.setCustomerType(type);
                        break;
                }
            }
        }
        System.out.println("UPDATED");
    }

    private static void displayEditMenuCustomer(){
        System.out.println("1.Name");
        System.out.println("2.Gender");
        System.out.println("3.Identity Card");
        System.out.println("4.Phone Number");
        System.out.println("5.Mail");
        System.out.println("6.Address");
        System.out.println("7.Type");
    }
}
