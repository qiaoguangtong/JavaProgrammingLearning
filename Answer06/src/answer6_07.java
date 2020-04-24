import java.util.Scanner;

public class answer6_07 {
	/** Financial application: compute the future investment value */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the information
		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate:");
		double rate = input.nextDouble();

		double monthlyInterestRate = rate / 1200;

		// Display the table heading
		System.out.println("Years\tFuture Value");

		// Display the table body
		for (int index = 1; index <= 30; index++) {
			System.out.printf("%-5d\t%10.2f", index, futureInvesetmentValue(amount, monthlyInterestRate, index));
			System.out.println();
		}
	}

	/** Return the future investment value */
	public static double futureInvesetmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

		return futureValue;
	}
}
