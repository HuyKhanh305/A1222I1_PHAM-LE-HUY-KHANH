package ss05_access_modifier_static_method.thuchanh.static_method;

public class TestStudent {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111,"Nguyen Van A");
        Student student2 = new Student(222,"Nguyen Van B");
        Student student3 = new Student(333,"Nguyen Van C");

        student1.display();
        student2.display();
        student3.display();
    }
}
