package service;

import repository.CustomerRepository;
import repository.ICustomerRepository;


public class CustomerServiceImpl implements CustomerService {

    private ICustomerRepository repository = new CustomerRepository();

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
