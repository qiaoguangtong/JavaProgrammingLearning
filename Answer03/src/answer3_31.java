import java.text.DecimalFormat;
import java.util.Scanner;

public class answer3_31 {
	public static void main(String[] args) {
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		Scanner input = new Scanner(System.in);
		double rate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int number = input.nextInt();
		DecimalFormat format = new DecimalFormat("#.00");
		switch (number) {
		case 0:
			System.out.print("Enter the dollars amount: ");
			double dollars1 = input.nextDouble();
			double RMB1 = dollars1 * rate;
			System.out.println("$" + dollars1 + " is " + RMB1 + " yuan.");
			break;
		case 1:
			System.out.print("Enter the RMB amount: ");
			double RMB0 = input.nextDouble();
			double dollars0 = RMB0 / rate;
			System.out.println(RMB0 + " yuan is $" + format.format(dollars0));
			break;
		default:
			System.out.println("Incorrect input.");
		}
	}
}
