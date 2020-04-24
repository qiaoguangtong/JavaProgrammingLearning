import java.util.Scanner;

public class answer5_31 {
	/** Financil application: compute CD value */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter ....
		System.out.print("Enter the initial deposit amount: ");
		double startValue = input.nextDouble();
		System.out.print("Enter the annual percentage yield: ");
		double annualRate = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonth = input.nextInt();
		
		double monthlyRate = annualRate/1200;
		double worthValue = startValue;
		
		// Display the table heading
		System.out.println("Month\tCD value");
		
		// Display the table body
		for(int month = 0; month <numberOfMonth;month++) {
			worthValue = worthValue + worthValue*monthlyRate;
			System.out.printf("%-5s\t%.2f", Integer.toString(month+1), worthValue);
			System.out.println();
		}
	}
}
