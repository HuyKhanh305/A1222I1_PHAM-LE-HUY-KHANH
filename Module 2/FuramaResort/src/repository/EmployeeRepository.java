package repository;

import model.Employee;
import utils.ReadWriteEmployee;
import utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {

    static Scanner sc = new Scanner(System.in);

    Validation validation = new Validation();
    static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee nv1 = new Employee("NV-1111", "Nguyen A", "male", "5464562", "042340935", "nguyena@gmail.com", "Graduated", "Expert", 50000);
        Employee nv2 = new Employee("NV-2222", "Nguyen B", "female", "2343455464562", "098742340935", "nguyenb@gmail.com", "University", "Reception", 50000);
        Employee nv3 = new Employee("NV-3333", "Nguyen C", "male", "787865464562", "05445642340935", "nguyenc@gmail.com", "Graduated", "Expert", 50000);
        employeeList.add(nv1);
        employeeList.add(nv2);
        employeeList.add(nv3);
    }


    @Override
    public void display() {
        writeReadFile();
        for (Employee employees : employeeList) {
            System.out.println(employees);
        }
    }

    private void writeReadFile() {
        try {
            List<Employee> result = ReadWriteEmployee.readEmployeeFile();
            for (Employee value: result) {
                System.out.println(value);
            }
            ReadWriteEmployee.writeEmployeeList(employeeList);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void add() {
        String id = validation.getEmployeeIdRegex();
        String name = validation.getNameRegex();
        System.out.println("Insert employee gender");
        String gender = sc.nextLine();
        String cardNumber = validation.getIdentityRegex();
        String phoneNumber = validation.getPhoneRegex();
        String mail = validation.getEmailRegex();
        System.out.println("Insert employee academic level");
        System.out.println("{\"Intermediate\",\"College\",\"University\",\"After Graduated\"}");
        String level = sc.nextLine();
        System.out.println("Insert employee position");
        System.out.println("{\"Receptionist\", \"Serve\", \"Expert\", \"Supervisor\", \"Manager\", \"Director\"}");
        String position = sc.nextLine();
        int salary = 0;
        while (salary <= 0) {
            System.out.println("Salary must to greater than 0");
            System.out.println("Insert salary");
            salary = sc.nextInt();
        }

        Employee newEmployee = new Employee(id,name,gender,cardNumber,phoneNumber,mail,level,position,salary);
        employeeList.add(newEmployee);
        writeReadFile();
    }

    @Override
    public void edit() {
        System.out.println("Insert employee id to edit");
        boolean check = false;
        String id = sc.nextLine();
        for (Employee employee : employeeList) {
            if (id.equals(employee.getId())) {
                check = true;
                displayEditMenuEmployee();
                System.out.println("What you want to edit?");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        String name = validation.getNameRegex();
                        employee.setName(name);
                        break;
                    case 2:
                        System.out.println("Insert employee gender");
                        String gender = sc.nextLine();
                        employee.setGender(gender);
                        break;
                    case 3:
                        String cardNumber = validation.getIdentityRegex();
                        employee.setIdentityCard(cardNumber);
                        break;
                    case 4:
                        String phoneNumber = validation.getPhoneRegex();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    case 5:
                        String mail = validation.getEmailRegex();
                        employee.setEmail(mail);
                        break;
                    case 6:
                        System.out.println("{\"Receptionist\", \"Serve\", \"Expert\", \"Supervisor\", \"Manager\", \"Director\"}");
                        System.out.println("Insert employee position");
                        String position = sc.nextLine();
                        employee.setPosition(position);
                        break;
                    case 7:
                        System.out.println("{\"Intermediate\",\"College\",\"University\",\"After Graduated\"}");
                        System.out.println("Insert employee academic level");
                        String level = sc.nextLine();
                        employee.setAcademicLevel(level);
                        break;
                    case 8:
                        int salary = 0;
                        while (salary <= 0) {
                            System.out.println("Salary must to greater than 0");
                            System.out.println("Insert salary");
                            salary = sc.nextInt();
                        }
                        employee.setSalary(salary);
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


    private static void displayEditMenuEmployee() {
        System.out.println("1.Name");
        System.out.println("2.Gender");
        System.out.println("3.Identity Card");
        System.out.println("4.Phone Number");
        System.out.println("5.Mail");
        System.out.println("6.Position");
        System.out.println("7.Academic Level");
        System.out.println("8.Salary");
    }
}
