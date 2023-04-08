package ss6_ke_thua.thuchanh.hecacdoituonghinhhoc;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red",true);
        System.out.println(shape1);

        Circle circle = new Circle(5);
        System.out.println(circle);
        Circle circle1 = new Circle("green",false,5);
        System.out.println(circle1);

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle("yellow",true,5,8);
        System.out.println(rectangle1);

        Square square = new Square(3);
        System.out.println(square);
        Square square1 = new Square("blue",true,5);
        System.out.println(square1);
    }
}
