package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String species;
        String name;
        int age;
        int rounds;

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna eläintarhalle nimi:");
        name = sc.nextLine();
        Zoo zoo = new Zoo(name);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                i = Integer.parseInt(sc.nextLine());

                switch (i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        age = Integer.parseInt(sc.nextLine());
                        Animal animal = new Animal(species, name, age);
                        zoo.addAnimal(animal);
                        break;
                    case 2:
                        zoo.listAnimals();
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        rounds = Integer.parseInt(sc.nextLine());
                        zoo.runAnimals(rounds);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}
