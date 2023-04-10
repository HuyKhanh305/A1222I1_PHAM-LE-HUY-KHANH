package ss7_abstract_class_interface.thuchanh.trien_khai_interface_comparator_cho_lop_hinh_hoc;

public class Rectangle {
    private double width = 1.0;
    private double length = 1.0;

    private String color = "blue";

    private boolean filled = true;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return  width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }


    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength();
    }
}
