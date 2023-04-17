package ss09_MVC.repository;

import ss09_MVC.model.Student;

public interface IStudentRepository {
    //CRUD sort, search order...
    Student[] findAll();

    void addStudent(Student student);
}
