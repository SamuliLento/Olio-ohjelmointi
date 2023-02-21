package main;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Vehicle> vehicles;

    public Storage () {
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle (Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listVehicles () {
        for (Vehicle vehicle : vehicles) {
            vehicle.printSpecs();
        }
    }

    public void driveCars () {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive();
            }
        }
    }

    public void flyPlanes () {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Plane) {
                Plane plane = (Plane) vehicle;
                plane.fly();
            }
        }
    }

    public void sailShips () {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Ship) {
                Ship ship = (Ship) vehicle;
                ship.sail();
            }
        }
    }
}
