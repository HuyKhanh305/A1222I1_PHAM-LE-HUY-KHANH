package ss6_ke_thua.thuchanh.hecacdoituonghinhhoc;

public class Square extends Rectangle{ ;

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side= " +getSide()+ " , which is a subclass of "+ super.toString();
    }
}
