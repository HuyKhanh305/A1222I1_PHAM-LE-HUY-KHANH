package service;

import repository.FacilityRepository;
import repository.IFacilityRepository;

public class FacilityServiceImpl implements FacilityService{
    private IFacilityRepository repository = new FacilityRepository();

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
