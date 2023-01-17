package Viikko3;

import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		
		int choice = 1;
        int input;
		Scanner scan = new Scanner(System.in);
		BottleDispenser bd = new BottleDispenser ();
		
		while (choice != 0) {
			System.out.println("\n*** BOTTLE DISPENSER ***");
			System.out.println("1) Add money to the machine");
			System.out.println("2) Buy a bottle");
			System.out.println("3) Take money out");
			System.out.println("4) List bottles in the dispenser");
			System.out.println("0) End");
			System.out.print("Your choice: ");
			
			choice = scan.nextInt();
			
			if (choice == 1) {
				bd.addMoney();
			}
			else if (choice == 2) {
                bd.listBottles();
                System.out.print("Your choice: ");
                input = scan.nextInt();
				bd.buyBottle(input);
			}
			else if (choice == 3) {
				bd.returnMoney();
			}
			else if (choice == 4) {
				bd.listBottles();
			}
			else if (choice == 0) {
				scan.close();
			}
			else {
				System.out.println("Incorrect choice!");
			}
		}
	}
}