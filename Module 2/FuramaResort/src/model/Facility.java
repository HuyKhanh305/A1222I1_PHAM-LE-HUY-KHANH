package model;

public abstract class Facility {
    private int id;
    private String name;
    private int area;
    private double price;
    private int maxCapacity;
    private String rentType;

    public Facility() {
    }

    public Facility(int id, String name, int area, double price, int maxCapacity, String rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxCapacity = maxCapacity;
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
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

