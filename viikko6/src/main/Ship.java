package main;

public class Ship extends Vehicle {
    
    public Ship (String manuf, String mod, int speed) {
        manufacturer = manuf;
        model = mod;
        topSpeed = speed;

        engine = new Engine("Wärtsilä Super", 1000);
    }

    public void sail () {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}
