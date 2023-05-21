package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    private static final String ID_REGEX = "^NV-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String IDENTITY_REGEX = "^[0-9]{9}|[0-9]{12}$";
    private static final String PHONE_REGEX = "^0+[0-9]{9}$";
    Scanner scanner = new Scanner(System.in);

    public String getIdRegex() {
        String id = "";
        while (true) {
            System.out.println("Insert ID (NV-YYYY)");
            id = scanner.nextLine();
            Pattern p = Pattern.compile(ID_REGEX);
            if (p.matcher(id).find()) {
                break;
            } else {
                System.out.println("Wrong input format");
            }
        }
        return id;
    }

    public String getNameRegex() {
        String name = "";
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
        String mail = "";
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
        String phoneNumber = "";
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
        String cardNumber = "";
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
}