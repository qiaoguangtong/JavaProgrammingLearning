import java.util.Scanner;

public class answer3_03 {
	public static void main(String[] args) {
		System.out.print("Enter a, b, c, d, e, f: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double denominator = a * d - b * c;
		if (denominator != 0) {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			System.out.println("x is " + x + " and y is " + y);
		} else {
			System.out.println("The equation has no solution");
		}
	}
}
