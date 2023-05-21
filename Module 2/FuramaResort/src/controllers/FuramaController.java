package controllers;

import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("Insert number to use");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    private static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        OUT:
        while (true) {
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            System.out.println("Insert num to detail");

            switch (scanner.nextInt()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    break OUT;
                default:
            }
        }
    }

    private static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        OUT:
        while (true) {
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            System.out.println("Insert num to detail");

            switch (scanner.nextInt()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    break OUT;
                default:
            }
        }
    }

    private static void displayFacilityMenu() {
        OUT:
        while (true) {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tDisplay list facility maintenance");
            System.out.println("4\tReturn main menu");
            System.out.println("Insert num to detail");

            switch (scanner.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break OUT;
                default:
            }
        }
    }

    private static void displayBookingMenu() {
        OUT:
        while (true) {
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new contract");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            System.out.println("Insert num to detail");

            switch (scanner.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break OUT;
                default:
            }
        }
    }

    private static void displayPromotionMenu() {
        OUT:
        while (true) {
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            System.out.println("Insert num to detail");

            switch (scanner.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break OUT;
                default:
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
