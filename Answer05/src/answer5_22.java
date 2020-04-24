import java.util.Scanner;

public class answer5_22 {
	/** Financial application: loan amortization schedule */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the information
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		int annualInterestRate = input.nextInt();

		// Compute monthly payment and total payment
		double monthlyInterestRate = annualInterestRate / 1200.0;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.println();
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);

		System.out.println();

		// Display the table
		// Display the heading
		System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");

		double balance = loanAmount;
		double interest;
		double principal;
		// Display the body
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-3d\t\t%.2f\t\t%.2f\t\t%.2f", i, interest, principal, balance);
			System.out.println();
		}

	}
}
