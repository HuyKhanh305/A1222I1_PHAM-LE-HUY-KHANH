package ss09_MVC.service;

import ss09_MVC.model.Student;

public interface IStudentService {
    //CRUD sort, search order...
    Student[] findAll();

    void addStudent(Student student);

    //validation
}
