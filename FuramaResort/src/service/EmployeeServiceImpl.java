package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    static Scanner sc = new Scanner(System.in);

    static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee nv1 = new Employee(1,"A","Male",2013242345,74843243,"aaa@gmail.com","Reception", "College", 5000000);
        Employee nv2 = new Employee(2,"B","Female",20832423,54735452,"bbb@gmail.com","Director", "University", 8000000);
        Employee nv3 = new Employee(3,"C","Female",20532232,34234543,"ccc@gmail.com","Supervisor", "Graduated", 9000000);
        employeeList.add(nv1);
        employeeList.add(nv2);
        employeeList.add(nv3);
    }
    @Override
    public void display() {
        for (Employee value : employeeList) {
            System.out.println(value);
        }
    }

    @Override
    public void add() {
        System.out.println("Insert employee id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Insert employee name");
        String name = sc.nextLine();
        System.out.println("Insert employee gender");
        String gender = sc.nextLine();
        System.out.println("Insert identity card");
        int cardNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Insert phone number");
        long phoneNumber = Long.parseLong(sc.nextLine());
        System.out.println("Insert email");
        String mail = sc.nextLine();
        System.out.println("Insert employee academic level");
        String level = sc.nextLine();
        System.out.println("Insert employee position");
        String position = sc.nextLine();
        System.out.println("Insert salary");
        int salary = Integer.parseInt(sc.nextLine());

        Employee newEmployee = new Employee(id,name,gender,cardNumber,phoneNumber,mail,position, level, salary);
        employeeList.add(newEmployee);
    }

    @Override
    public void edit() {
        System.out.println("Insert employee id to edit");
        int id = Integer.parseInt(sc.nextLine());
        for (Employee employee: employeeList) {
            if (id == employee.getId()){
                displayEditMenuEmployee();
                System.out.println("What you want to edit?");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Insert employee name");
                        String name = sc.nextLine();
                        employee.setName(name);
                        break;
                    case 2:
                        System.out.println("Insert employee gender");
                        String gender = sc.nextLine();
                        employee.setGender(gender);
                        break;
                    case 3:
                        System.out.println("Insert identity card");
                        int cardNumber = sc.nextInt();
                        employee.setIdentityCard(cardNumber);
                        break;
                    case 4:
                        System.out.println("Insert phone number");
                        long phoneNumber = sc.nextLong();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    case 5:
                        System.out.println("Insert email");
                        String mail = sc.nextLine();
                        employee.setEmail(mail);
                        break;
                    case 6:
                        System.out.println("Insert employee position");
                        String position = sc.nextLine();
                        employee.setPosition(position);
                        break;
                    case 7:
                        System.out.println("Insert employee academic level");
                        String level = sc.nextLine();
                        employee.setAcademicLevel(level);
                        break;
                    case 8:
                        System.out.println("Insert salary");
                        int salary = sc.nextInt();
                        employee.setSalary(salary);
                        break;
                }
            }
        }
        System.out.println("Update completed");
    }

    private static void displayEditMenuEmployee(){
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
