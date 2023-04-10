package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparable_cho_lop_hinh_hoc;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    private boolean filled = true;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius();
    }
}
