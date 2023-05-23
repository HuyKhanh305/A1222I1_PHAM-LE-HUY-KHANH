package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    private static final String EMPLOYEE_ID_REGEX = "^NV-[0-9]{4}$";

    private static final String CUSTOMER_ID_REGEX = "^KH-[0-9]{4}$";
    private static final String RENT_TYPE_REGEX = "^[A-Z][a-z]+\\s[A-Z][a-z]+$";

    private static final String FACILITY_TYPE_REGEX = "^[A-Z][a-z]+$";
    private static final String FACILITY_ID_REGEX = "^SV[A-Z]{2}-[0-9]{4}$";
    private static final String FACILITY_NAME_REGEX = "^[A-Z][a-z]+$";
    private static final String NAME_REGEX = "^[A-Z][a-z]+\\s[A-Z][a-z]+$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String IDENTITY_REGEX = "^[0-9]{9}|[0-9]{12}$";
    private static final String PHONE_REGEX = "^0+[0-9]{9}$";
    Scanner scanner = new Scanner(System.in);

    public String getEmployeeIdRegex() {
        String id;
        while (true) {
            System.out.println("Insert ID (NV-YYYY)");
            id = scanner.nextLine();
            Pattern p = Pattern.compile(EMPLOYEE_ID_REGEX);
            if (p.matcher(id).find()) {
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return id;
    }

    public String getCustomerIdRegex() {
        String id;
        while (true) {
            System.out.println("Insert ID (KH-YYYY)");
            id = scanner.nextLine();
            Pattern p = Pattern.compile(CUSTOMER_ID_REGEX);
            if (p.matcher(id).find()) {
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return id;
    }

    public String getNameRegex() {
        String name;
        while (true) {
            System.out.println("Insert name");
            name = scanner.nextLine();
            Pattern p = Pattern.compile(NAME_REGEX);
            if (p.matcher(name).find()) {
                break;
            } else {
                System.out.println("Capitalize first letter in name");
            }
        }
        return name;
    }

    public String getEmailRegex() {
        String mail;
        while (true) {
            System.out.println("Insert email");
            mail = scanner.nextLine();
            Pattern p = Pattern.compile(EMAIL_REGEX);
            if (p.matcher(mail).find()) {
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return mail;
    }

    public String getPhoneRegex() {
        String phoneNumber;
        while (true) {
            System.out.println("Insert phone number (10 digits)");
            phoneNumber = scanner.nextLine();
            Pattern p = Pattern.compile(PHONE_REGEX);
            if (p.matcher(phoneNumber).find()) {
                break;
            } else {
                System.out.println("Phone number start with 0, has 10 digits");
            }
        }
        return phoneNumber;
    }

    public String getIdentityRegex() {
        String cardNumber;
        while (true) {
            System.out.println("Insert identity card");
            cardNumber = scanner.nextLine();
            Pattern p = Pattern.compile(IDENTITY_REGEX);
            if (p.matcher(cardNumber).find()) {
                break;
            } else {
                System.out.println("Identity number has 9 or 12 digits");
            }
        }
        return cardNumber;
    }

    public String getFacilityIdRegex(){
        String facilityID;
        while (true){
            System.out.println("Insert ID (SVXX-YYYY)");
            facilityID = scanner.nextLine();
            Pattern p = Pattern.compile(FACILITY_ID_REGEX);
            if (p.matcher(facilityID).find()){
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return facilityID;
    }

    public String getFacilityNameRegex(){
        String facilityName;
        while (true){
            System.out.println("Insert service name");
            facilityName = scanner.nextLine();
            Pattern p = Pattern.compile(FACILITY_NAME_REGEX);
            if (p.matcher(facilityName).find()){
                break;
            } else {
                System.out.println("Capitalize first letter in name");
            }
        }
        return facilityName;
    }

    public String getRentTypeRegex(){
        String rentType;
        while (true){
            System.out.println("Insert Rent Type (By Day/Month/Year)");
            rentType = scanner.nextLine();
            Pattern p = Pattern.compile(RENT_TYPE_REGEX);
            if (p.matcher(rentType).find()){
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return rentType;
    }

    public String getFacilityTypeRegex(){
        String facilityType;
        while (true){
            System.out.println("Insert facility type");
            facilityType = scanner.nextLine();
            Pattern p = Pattern.compile(FACILITY_TYPE_REGEX);
            if (p.matcher(facilityType).find()){
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return facilityType;
    }

    public double checkPrice(){
        double price;
        do {
            System.out.println("Price need to greater than 0");
            System.out.println("Insert price");
            price = Double.parseDouble(scanner.nextLine());
        }while (price < 0);
        return price;
    }

    public int checkMaxCapacity(){
        int maxCapacity;
        do {
            System.out.println("Insert max capacity");
            maxCapacity = Integer.parseInt(scanner.nextLine());
        }while (maxCapacity > 20 || maxCapacity < 0);
        return maxCapacity;
    }

    public double checkArea(){
        double area;
        do {
            System.out.println("Area have to greater than 30m2");
            System.out.println("Insert Area");
            area = Double.parseDouble(scanner.nextLine());
        } while (area < 30);
        return area;
    }

    public double checkPoolArea(){
        double pollArea;
        do {
            System.out.println("Pool Area have to greater than 30m2");
            System.out.println("Insert Pool Area");
            pollArea = Double.parseDouble(scanner.nextLine());
        } while (pollArea < 30);
        return pollArea;
    }

}