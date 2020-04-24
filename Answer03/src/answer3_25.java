import java.text.DecimalFormat;
import java.util.Scanner;

public class answer3_25 {
	public static void main(String[] args) {
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double denominator = a * d - b * c;
		DecimalFormat format = new DecimalFormat("#.00000");
		if (denominator != 0) {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			System.out.println("x is " + format.format(x) + " and y is "+ format.format(y));
		} else {
			System.out.println("The equation has no solution");
		}
	}
}
