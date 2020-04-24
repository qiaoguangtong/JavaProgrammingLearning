import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_13 {
	public static void main(String[] args) {
		double rate = 0.00417;
		System.out.print("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double every = input.nextDouble();
		double total = 0;
		int n = 6;
		for (int i = 0; i < 6; i++) {
			total = (every + total) * (1 + rate);
		}
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("After the sixth month, the account value is $" + format.format(total));
	}
}
