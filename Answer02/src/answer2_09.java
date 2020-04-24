import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_09 {
	public static void main(String[] args) {
		System.out.print("Enter v0, v1, and t: ");
		Scanner input = new Scanner(System.in);
		double velocity0 = input.nextDouble();
		double velocity1 = input.nextDouble();
		double time = input.nextDouble();
		double acceleration = (velocity1 - velocity0) / time;
		DecimalFormat a = new DecimalFormat("#.0000");
		System.out.println("The average acceleration is " + a.format(acceleration));
	}
}
