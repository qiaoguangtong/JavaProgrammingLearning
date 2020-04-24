import java.util.Scanner;

public class answer4_23 {
	public static void main(String[] args) {
		System.out.print("Enter employee's name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hour = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		// Calculating
		double grossPay = rate * hour;
		double fedHolding = grossPay * fedRate;
		double stateHolding = grossPay * stateRate;
		double totalDe = fedHolding + stateHolding;
		double netPay = grossPay - totalDe;
		// Output list
		System.out.println();
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hour);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding (" + 100 * fedRate + "%): $" + fedHolding);
		System.out.println("  State Withholding(" + 100 * stateRate + "%): $" + stateHolding);
		System.out.println("  Total Deduction: $" + totalDe);
		System.out.println("Net Pay: $" + netPay);
	}
}