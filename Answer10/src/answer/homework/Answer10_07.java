package answer.homework;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Master_Joe
 * @version ATM machine
 */
public class Answer10_07 {
	private static Scanner scanner;

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		// Initialize Account objects
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
//		for (int i = 0; i < accounts.length; i++) {
//			accounts[i].setId(i);
//			accounts[i].setBalance(100.0);
//		}
		scanner = new Scanner(System.in);
		while (true) {
			// Enter an id
			System.out.print("Enter an id: ");
			int newId = scanner.nextInt();
			while (true) {
				System.out.println();
				// Show the main menu
				showMenu();

				// Enter a choice
				System.out.print("Enter a choice: ");
				int operationNumber = scanner.nextInt();

				// Operation
				switch (operationNumber) {
				case 1:
					System.out.println("The balance is " + accounts[newId].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					double withdraw = scanner.nextDouble();
					accounts[newId].withdraw(withdraw);
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					double deposit = scanner.nextDouble();
					accounts[newId].deposit(deposit);
					break;
				case 4:
					break;
				default:
					System.out.println("ERROR! Try again!");
					break;
				}
				if (operationNumber == 4) {
					System.out.println();
					break;
				}
			}
		}
	}

	/** Display the main menu */
	public static void showMenu() {
		System.out.println("Main menu\n" + "1. check balance\n" + "2. withdraw\n" + "3. deposit\n" + "4. exit");
	}
}

class Account {
	private int id = 0; // Default 0
	private double balance = 0; // Default 0
	private double annualInterestRate = 0; // Default annual interest is 0
	private Date dateCreated; // date for registering

	public Account() {

	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public Date getCreatedDate() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.00;
	}

	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}
}