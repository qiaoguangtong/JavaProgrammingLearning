import java.util.Scanner;

public class answer5_30 {
	/** Financial application: compound value */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the information
		System.out.print("Enter your amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of month: ");
		int numberOfMonth = input.nextInt();

		// Compute the monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		for (int i = 0; i < numberOfMonth; i++) {
			amount = (i * 100 + amount) * (1 + monthlyInterestRate);
			System.out.printf("Your ammount is %.3f in %d months\n",amount,i+1);
		}
	}
}
