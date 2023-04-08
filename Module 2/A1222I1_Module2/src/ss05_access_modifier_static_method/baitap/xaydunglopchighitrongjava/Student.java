package ss05_access_modifier_static_method.baitap.xaydunglopchighitrongjava;

public class Student {
    private static String name;
    private static String classRoom;

    static {
        name = "John";
        classRoom = "C02";
    }
    public Student(){}

    public static void setName(String name) {
        Student.name = name;
    }

     public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }

    public String toString(){
        return name + " " + classRoom;
    }
}

class Test{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student.setClassRoom("A12");
        Student.setName("Bill");
        System.out.println("Name & Classes: "+ student1);
    }
}
