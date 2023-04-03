package ss04_oop_huong_doi_tuong.baitap;

public class Fan {
    int Slow = 1, Medium = 2, Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {}

    public String getColor() {
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == 1) {
            this.speed = Slow;
        } else if (speed == 2) {
            this.speed = Medium;
        } else {
            this.speed = Fast;
        }
    }

    public String toString(){
        if (!isOn()){
            return "tốc độ là: " + speed + " màu quạt là: " + color +" bán kính quạt là: " + radius + " fan is on";
        } else {
            return "màu sắc quạt là: "+color +" bán kính quạt là: " + radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.Fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(fan1.isOn());
        System.out.println(fan1+"\n");

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getSpeed());
        fan2.setRadius(fan2.getRadius());
        fan2.setColor(fan2.getColor());
        fan2.setOn(!fan2.isOn());
        System.out.println(fan2+ "\n");
    }
}
