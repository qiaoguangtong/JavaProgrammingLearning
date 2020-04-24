import java.text.DecimalFormat;
import java.util.Scanner;

public class answer3_20 {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit between -58¡ãF and 41¡ãF: ");
		Scanner input = new Scanner(System.in);
		double Fahr = input.nextDouble();
		if (Fahr > 41 || Fahr < -51) {
			System.out.println("Input ERROR!!!");
			return;
		}
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double velocity = input.nextDouble();
		if (velocity < 2) {
			System.out.println("Input ERROR!!!");
			return;
		}
		double twc = 35.74 + 0.6215 * Fahr - 35.75 * Math.pow(velocity, 0.16)
				+ 0.4275 * Fahr * Math.pow(velocity, 0.16);
		DecimalFormat f = new DecimalFormat("#.00000");
		System.out.println("The wind chill index is " + f.format(twc));

	}
}
