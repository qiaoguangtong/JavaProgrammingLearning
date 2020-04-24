import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_20 {
	public static void main(String [] args) {
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		double interest = balance*rate/1200;
		DecimalFormat f = new DecimalFormat("#.00000");
		System.out.println("The interest is "+ f.format(interest));
	}
}
