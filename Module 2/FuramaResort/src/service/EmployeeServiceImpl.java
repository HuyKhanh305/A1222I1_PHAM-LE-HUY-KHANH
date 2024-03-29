package service;

import repository.EmployeeRepository;
import repository.IEmployeeRepository;

import java.io.IOException;

public class EmployeeServiceImpl implements EmployeeService {

    private IEmployeeRepository repository = new EmployeeRepository();


    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add() {
        repository.add();
    }

    @Override
    public void edit() {
        repository.edit();
    }
}
