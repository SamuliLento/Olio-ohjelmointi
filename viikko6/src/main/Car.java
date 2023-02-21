package main;

public class Car extends Vehicle {

    public Car (String manuf, String mod, int speed) {
        manufacturer = manuf;
        model = mod;
        topSpeed = speed;

        engine = new Engine("V8", 300);
    }

    public void drive () {
        System.out.println(manufacturer + " " + model + " paahtaa tietä eteenpäin!");
    }
}
