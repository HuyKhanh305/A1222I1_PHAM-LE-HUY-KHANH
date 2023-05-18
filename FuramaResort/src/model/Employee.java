package model;

public class Employee extends Person {
    private String academicLevel;
    //* academicLevel = {"Intermediate","College","University","After Graduated"};
    private String position;
    //* position = {"Receptionist", "Serve", "Expert", "Supervisor", "Manager", "Director"};
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String gender, int identityCard, long phoneNumber, String email, String position, String academicLevel ,int salary) {
        super(id, name, gender, identityCard, phoneNumber, email);
        this.salary = salary;
        this.academicLevel = academicLevel;
        this.position = position;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
