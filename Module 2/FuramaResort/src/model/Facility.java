package model;

public abstract class Facility {
    private String id;
    private String name;
    private double area;
    private double price;
    private int maxCapacity;
    private String rentType;

    public Facility() {
    }

    public Facility(String id, String name, double area, double price, int maxCapacity, String rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}

