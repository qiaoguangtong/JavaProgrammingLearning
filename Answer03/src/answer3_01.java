import java.text.DecimalFormat;
import java.util.Scanner;

public class answer3_01 {
	public static void main(String[] args) {
		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		DecimalFormat f = new DecimalFormat("#.000000");
		double judge = b * b - 4 * a * c;
		if (judge > 0) {
			double root1 = (-b + Math.pow(judge, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(judge, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + f.format(root1) + " and " + f.format(root2));
		} else if (judge == 0) {
			double root0 = (-b + Math.pow(judge, 0.5)) / (2 * a);
			System.out.println("The equation has one root " + f.format(root0));
		} else
			System.out.println("The eauation has no real roots");
	}
}
