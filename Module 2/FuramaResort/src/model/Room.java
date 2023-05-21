package model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(int id, String name, int area, double price, int maxCapacity, String rentType, String freeService) {
        super(id, name, area, price, maxCapacity, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
