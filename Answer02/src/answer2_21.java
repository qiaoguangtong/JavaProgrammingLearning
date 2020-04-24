import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_21 {
	public static void main(String[] args) {
		System.out.print("Enter investment amount: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double rateY = input.nextDouble();
		double rateM = rateY / 12 / 100;
		System.out.print("Enter number of years: ");
		int year = input.nextInt();
		double value = amount * Math.pow(1 + rateM, year * 12);
		DecimalFormat f = new DecimalFormat("#.00");
		System.out.println("Accumulated value is $" + f.format(value));
	}
}
