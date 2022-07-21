package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<VehicleType,Vehicle> vehicles = new HashMap<>();

    public Registry(){
        this.intialize();
    }
    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
            vehicle =(Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }

    private void intialize() {
        Car car = new Car();
        car.setEngineCapacity(2000);
        car.setFualType("Petral");
        car.setType("Mini");


        Bus bus = new Bus();
        bus.setNumberOfSeats(40);
        bus.setEngineCapacity(3000);
        bus.setFualType("Diesl");

        vehicles.put(VehicleType.CAR,car);
        vehicles.put(VehicleType.BUS,bus);
    }
}
