package main;

import java.util.ArrayList;

public class Zoo {
    
    private String name;
    private ArrayList<Animal> animals;

    public Zoo (String n) {
        name = n;
        animals = new ArrayList<Animal>();
    }

    public void addAnimal (Animal a) {
        animals.add(a);
    }

    public void listAnimals () {
        System.out.println(name + " pitää sisällään seuraavat eläimet:");

        for (Animal animal : animals) {
            System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " vuotta");
        }
    }

    public void runAnimals (int r) {
        for (Animal animal : animals) {
            for (int i = 1; i <= r; i++) {
                System.out.println(animal.getName() + " juoksee kovaa vauhtia!");
            }
        }
    }
}
