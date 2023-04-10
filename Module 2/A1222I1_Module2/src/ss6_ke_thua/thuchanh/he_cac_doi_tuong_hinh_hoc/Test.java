package ss6_ke_thua.thuchanh.he_cac_doi_tuong_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red",true);
        System.out.println(shape1);

        Circle circle = new Circle(5);
        System.out.println(circle);
        double result = circle.getPerimeter();
        System.out.println("Perimeter of circle is: "+result);
        Circle circle1 = new Circle("green",false,2);
        System.out.println(circle1);

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle);
        double kq = rectangle.getArea();
        System.out.println("Area of rectangle is: " +kq);
        Rectangle rectangle1 = new Rectangle("yellow",true,5,8);
        System.out.println(rectangle1);

        Square square = new Square(3);
        System.out.println(square);
        Square square1 = new Square("blue",true,5);
        System.out.println(square1);
    }
}
