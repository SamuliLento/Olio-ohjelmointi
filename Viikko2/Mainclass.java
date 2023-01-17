package Viikko2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    public static void main(String[] args) {
        
        String input = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Give a name to the dog: ");

        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("VIRHE!");
        }

        Dog dog1 = new Dog(input);
        
        dog1.speak();
    }
}