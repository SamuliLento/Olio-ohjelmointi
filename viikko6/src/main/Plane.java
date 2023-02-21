package main;

public class Plane extends Vehicle {

    public Plane (String manuf, String mod, int speed) {
        manufacturer = manuf;
        model = mod;
        topSpeed = speed;

        engine = new Engine("Suihkumoottori", 500);
    }

    public void fly () {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}
