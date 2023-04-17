package ss09_MVC.service;

import ss09_MVC.model.Student;
import ss09_MVC.repository.IStudentRepository;
import ss09_MVC.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService{
    private IStudentRepository repository = new StudentRepositoryImpl();
    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {

    }
}
