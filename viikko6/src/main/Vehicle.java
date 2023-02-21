package main;

public class Vehicle {

    protected String manufacturer;
    protected String model;
    protected int topSpeed;
    protected Engine engine;
    
    public void printSpecs () {
        if (this instanceof Car) {
            System.out.println("Auto: " + manufacturer + " " + model);
        } else if (this instanceof Plane) {
            System.out.println("Lentokone: " + manufacturer + " " + model);
        } else if (this instanceof Ship) {
            System.out.println("Laiva: " + manufacturer + " " + model);
        }
        engine.printSpecs();
        System.out.println("Huippunopeus: " + topSpeed + "km/h\n");
    }
}
