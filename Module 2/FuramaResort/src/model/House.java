package model;

public class House extends Facility{
    private String houseType;
    private int floor;

    public House() {
    }
    public House(String id, String name, double area, double price, int maxCapacity, String rentType, String houseType, int floor) {
        super(id, name, area, price, maxCapacity, rentType);
        this.houseType = houseType;
        this.floor = floor;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "houseType='" + houseType + '\'' +
                ", floor=" + floor +
                '}';
    }
}
