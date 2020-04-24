import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_12 {
	public static void main(String[] args) {
		System.out.print("Enter speed and acceleration: ");
		Scanner input = new Scanner(System.in);
		double velocity = input.nextDouble();
		double acceleration = input.nextDouble();
		double length = velocity * velocity / (2 * acceleration);
		DecimalFormat len = new DecimalFormat();
		System.out.println("The minimum runway length for this airplane is " + len.format(length));
	}
}
