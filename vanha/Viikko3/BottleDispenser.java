package Viikko3;

import java.util.ArrayList;

public class BottleDispenser {
    private int bottles;
    private double money;
    private ArrayList<Bottle> bottle_array;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
        bottle_array = new ArrayList<Bottle>();

        bottle_array.add(new Bottle());
        bottle_array.add(new Bottle("Pepsi Max", "Pepsi", 0.9, 1.5, 2.2));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 0.5, 2.0));
        bottle_array.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.9, 1.5, 2.5));
        bottle_array.add(new Bottle("Fanta Zero", "Coca-Cola", 0.3, 0.5, 1.95));
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle(int input) {
        if (bottles == 0) {
            System.out.println("Empty");
        } else {
            if (money < bottle_array.get(input - 1).getPrice()) {
                System.out.println("Add money first!");
            } else {
                bottles -= 1;
                money -= bottle_array.get(input - 1).getPrice();
                System.out.println("KACHUNK! " + bottle_array.get(input - 1).getName() + " came out of the dispenser!");
                bottle_array.remove(input - 1);
            }
        }
    }
    
    public void listBottles() {
        for (int i = 0; i < bottles; i++) {
            System.out.println((i + 1) + ". Name: " + bottle_array.get(i).getName());
            System.out.println("\tSize: " + bottle_array.get(i).getSize() + "\tPrice: " + bottle_array.get(i).getPrice());
        }
    }

    public void returnMoney() {
        System.out.printf("Klink klink. Money came out! You got %.2f€ back\n", money);
        money = 0;
    }
}