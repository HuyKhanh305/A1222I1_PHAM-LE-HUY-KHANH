package repository;

import model.Customer;
import utils.Validation;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository{

    Validation validation = new Validation();
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer("KH-1111","Pham A","male","54353432","094234943","phama@hihi.com","Silver","123 Avenue");
        Customer customer2 = new Customer("KH-2222","Pham B","male","78353432","09487794943","phamb@hihi.com","Platinum","Alley 124");
        Customer customer3 = new Customer("KH-3333","Pham C","female","35353432","0994534943","phamc@hihi.com","Silver","123 Street");
       customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    @Override
    public void display() {
        for (Customer customers : customerList) {
            System.out.println(customers);
        }
    }

    @Override
    public void add() {

        String id = validation.getIdRegex();
        String name = validation.getNameRegex();
        System.out.println("Insert Customer gender");
        String gender = scanner.nextLine();
        String cardNumber = validation.getIdentityRegex();
        String phoneNumber = validation.getPhoneRegex();
        String mail = validation.getEmailRegex();
        System.out.println("Insert Customer address");
        String address = scanner.nextLine();
        System.out.println("Insert Customer type");
        String type = scanner.nextLine();
        Customer newCustomer = new Customer(id,name,gender,cardNumber,phoneNumber,mail,type,address);
        customerList.add(newCustomer);
        System.out.println("Add new customer: completed");
    }

    @Override
    public void edit() {
        System.out.println("Insert customer id to edit");
        String id = scanner.nextLine();
        boolean check = false;
        for (Customer customers : customerList) {
            if (id.equals(customers.getId())) {
                check = true;
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
                        String cardNumber = validation.getIdentityRegex();
                        customers.setIdentityCard(cardNumber);
                        break;
                    case 4:
                        String phoneNumber = validation.getPhoneRegex();
                        customers.setPhoneNumber(phoneNumber);
                        break;
                    case 5:
                        String mail = validation.getEmailRegex();
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
        if (check) {
            System.out.println("Update completed");
        } else {
            System.out.println("ID not found");
        }
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
