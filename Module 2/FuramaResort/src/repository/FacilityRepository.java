package repository;

import model.Facility;
import model.House;
import model.Room;
import model.Villa;
import utils.Validation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepository implements IFacilityRepository{

    Scanner scanner = new Scanner(System.in);

    Validation validation = new Validation();
    static Map<Facility, Integer> facilityNumberMap = new LinkedHashMap<>();

    static {
        Room room1 = new Room("SVRO-1111","Room",100,15000000,3,"By Day","Free Breakfast");
        House house1 = new House("SVHO-1111","House",500,3800000,10,"By Month","Silver",3);
        Villa villa1 = new Villa("SVVL-1111","Villa",900,30000000,20,"By Year","Platinum",80,2);
        facilityNumberMap.put(room1,0);
        facilityNumberMap.put(house1,0);
        facilityNumberMap.put(villa1,0);
    }
    @Override
    public void display() {
        for (Facility facilities: facilityNumberMap.keySet()) {
            int value = facilityNumberMap.get(facilities);
            System.out.println(facilities+ ".Number of uses: "+ value);
        }
    }

    @Override
    public void add() {
        System.out.println("1.Add new House");
        System.out.println("2.Add new Room");
        System.out.println("3.Add new Villa");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                String id = validation.getFacilityIdRegex();
                String name = validation.getFacilityNameRegex();
                System.out.println("Insert Area");
                double area = validation.checkArea();
                double price = validation.checkPrice();
                int maxCapacity = validation.checkMaxCapacity();
                String rentType = validation.getRentTypeRegex();
                System.out.println("Insert House Type");
                String houseType = validation.getFacilityTypeRegex();
                System.out.println("Insert floor");
                int floor = Integer.parseInt(scanner.nextLine());

                House newHouse = new House(id,name,area,price,maxCapacity,rentType,houseType,floor);
                facilityNumberMap.put(newHouse,0);
                break;
            case 2:
                id = validation.getFacilityIdRegex();
                name = validation.getFacilityNameRegex();
                System.out.println("Insert Area");
                area = validation.checkArea();
                System.out.println("Insert Room price");
                price = validation.checkPrice();
                maxCapacity = validation.checkMaxCapacity();
                rentType = validation.getRentTypeRegex();
                System.out.println("Insert Free Service");
                String freeService = scanner.nextLine();

                Room newRoom = new Room(id,name,area,price,maxCapacity,rentType,freeService);
                facilityNumberMap.put(newRoom,0);
                break;
            case 3:
                id = validation.getFacilityIdRegex();
                name = validation.getFacilityNameRegex();
                area = validation.checkArea();
                System.out.println("Insert Villa price");
                price = validation.checkPrice();
                maxCapacity = validation.checkMaxCapacity();
                rentType = validation.getRentTypeRegex();
                String villaType = validation.getFacilityTypeRegex();
                double pool = validation.checkPoolArea();
                System.out.println("Insert floor");
                floor = Integer.parseInt(scanner.nextLine());

                Villa newVilla = new Villa(id,name,area,price,maxCapacity,rentType,villaType,pool,floor);
                facilityNumberMap.put(newVilla,0);
                break;
        }
    }

    @Override
    public void edit() {

    }
}
