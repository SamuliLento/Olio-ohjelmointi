package main;

public class Animal {
    
    private String species;
    private String name;
    private int age;

    public Animal (String s, String n, int a) {
        species = s;
        name = n;
        age = a;
    }

    public String getSpecies () {
        return species;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}
