package ss05_access_modifier_static_method.baitap;

public class Circle {
    private static double radius;

    private static String color;

    static {
        radius = 1;
        color = "red";
    }

    public Circle() {}


    public Circle(double r) {
        Circle.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}

class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println("Radius is: " + circle1.getRadius());
        System.out.println("Area is: " + circle1.getArea());
    }
}
