import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_16 {
	public static void main(String[] args) {
		System.out.print("Enter the side: ");
		Scanner input = new Scanner(System.in);
		double s = input.nextDouble();
		double coefficient = 3.0 * Math.pow(3, 0.5) / 2;
		double area = coefficient * s * s;
		DecimalFormat format = new DecimalFormat("#.0000");
		System.out.println("The area of the hexagon is " + format.format(area));
	}
}
