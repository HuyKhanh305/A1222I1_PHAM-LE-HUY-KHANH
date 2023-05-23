package model;

public class Villa extends Facility{
    private String villaType;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String name, double area, double price, int maxCapacity, String rentType, String villaType, double poolArea, int floor) {
        super(id, name, area, price, maxCapacity, rentType);
        this.villaType = villaType;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getVillaType() {
        return villaType;
    }

    public void setVillaType(String villaType) {
        this.villaType = villaType;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "villaType='" + villaType + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
