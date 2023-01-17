package Viikko6;

public class Bank {

	public void addAccount(String account, int money, int credit) {
		if (credit == 0) {
			System.out.println("Adding to bank: " + account + "," + money);
		} else {
			System.out.println("Adding to bank: " + account + "," + money + "," + credit);
		}
	}
	
	public void deposit (String account, int money) {
		System.out.println("Depositing to the account: " + account + " the amount " + money);
	}
	
	public void withdraw (String account, int money) {
		System.out.println("Withdrawing from the account: " + account + " the amount " + money);
	}
	
	public void removeAccount(String account) {
		System.out.println("Account removed.");
	}
	
	public void searchAccount(String account) {
		System.out.println("Searching for account: " + account);
	}
	
	public void allAccounts() {
		System.out.println("All accounts:");
	}    
}