package ss6_ke_thua.baitap.lopcirclevalopcylinder;

public class Circle {
    public long radius;
    public String color;

    public Circle(){}

    public Circle(long radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getArea(){
        System.out.println("Area is: " +Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

