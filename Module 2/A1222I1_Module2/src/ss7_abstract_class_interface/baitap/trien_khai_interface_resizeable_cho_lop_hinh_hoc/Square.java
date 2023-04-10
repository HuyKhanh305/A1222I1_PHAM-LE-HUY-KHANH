package ss7_abstract_class_interface.baitap.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class Square extends Rectangle implements Resizeable { ;

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public Square(){}
    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Ty le kich thuoc hinh vuong la: "+ getArea() * percent);
    }

    @Override
    public double getArea() {
        return super.getArea();
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
