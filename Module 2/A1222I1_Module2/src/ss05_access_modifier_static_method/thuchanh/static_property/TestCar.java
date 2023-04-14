package ss05_access_modifier_static_method.thuchanh.static_property;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","Sky4");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Tokyo","Sky6");
        System.out.println(Car.numberOfCars);
    }
}
