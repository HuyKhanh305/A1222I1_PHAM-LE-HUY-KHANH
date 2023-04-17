package ss09_MVC.controller;

import ss09_MVC.model.Student;
import ss09_MVC.service.IStudentService;
import ss09_MVC.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static IStudentService service = new StudentServiceImpl();

    //    private static IStudentRepository repository = new StudentRepositoryImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Student Manager----");
            System.out.println("1. List");
            System.out.println("2. Add new");
            System.out.println("3. Update");
            System.out.println("4. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1: //List
                    Student[] studentList = service.findAll();
//                    Student[] studentList = repository.findAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2: //Add
                    break;
                case 3: //Update
                    break;
                case 4: //exit
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}
