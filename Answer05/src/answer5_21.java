import java.util.Scanner;

public class answer5_21 {
	/** Financial application: compute loans with various interest rates */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the information
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();

		// Display the table heading
		System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");

		// Display the table body
		for (double interest = 5; interest <= 8; interest += 0.125) {
			double monthlyInterestRate = interest / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			System.out.print("%");
			System.out.printf("%.3f\t\t%.2f\t\t\t%.2f\n", interest, monthlyPayment,
					monthlyPayment * numberOfYears * 12);
		}
	}
}
