import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_17 {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit between -58��F and 41��F: ");
		Scanner input = new Scanner(System.in);
		double Fahr = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double velocity = input.nextDouble();
		double twc = 35.74 + 0.6215 * Fahr - 35.75 * Math.pow(velocity, 0.16)
				+ 0.4275 * Fahr * Math.pow(velocity, 0.16);
		DecimalFormat f = new DecimalFormat("#.00000");
		System.out.println("The wind chill index is " + f.format(twc));

	}
}
