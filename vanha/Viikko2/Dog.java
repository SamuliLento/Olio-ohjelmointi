package Viikko2;

import java.util.Scanner;

public class Dog {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public Dog (String n) {
        name = n.trim();

        if (name.isEmpty() == true) {
            name = "Doge";
        }
        System.out.println("Hey, my name is " + name);
    }

    public void speak() {

        System.out.print("What does a dog say: ");

        while (scanner.hasNext()) {
            if (scanner.hasNextBoolean()) {
                System.out.println("Such boolean: "+ scanner.next());
            }
            else if (scanner.hasNextInt()) {
                System.out.println("Such integer: "+ scanner.next());
            }
            else {
                System.out.println(scanner.next());
            }
        }
    }
}