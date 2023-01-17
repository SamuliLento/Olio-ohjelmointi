package Viikko6;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
		int choice = 1;
		String account;
		int money;
		int credit;
		
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
        
		while (choice !=0) {
			System.out.println("\n*** BANK SYSTEM ***");
			System.out.println("1) Add a regular account");
			System.out.println("2) Add a credit account");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Remove an account");
			System.out.println("6) Print account information");
			System.out.println("7) Print all accounts");
			System.out.println("0) Quit");
			System.out.print("Your choice: ");
			
			choice = scan.nextInt();
			
			if (choice == 1) {
                credit = 0;
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
				money = scan.nextInt();
				bank.addAccount(account, money, credit);
			} else if (choice == 2) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
				money = scan.nextInt();
				System.out.print("Give a credit limit: ");
				credit = scan.nextInt();
				bank.addAccount(account, money, credit);
			} else if (choice == 3) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
				money = scan.nextInt();
				bank.deposit(account, money);
			} else if (choice == 4) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to withdraw: ");
				money = scan.nextInt();
				bank.withdraw(account, money);
			} else if (choice == 5) {
				System.out.print("Give the account number of the account to delete: ");
				account = scan.next();
				bank.removeAccount(account);
			} else if (choice == 6) {
				System.out.print("Give the account number of the account to print information from: ");
				account = scan.next();
                bank.searchAccount(account);
			} else if (choice == 7) {
                bank.allAccounts();
			} else if (choice == 0) {
				scan.close();
			} else {
				System.out.println("Invalid choice.");
			}
		}        
    }
}