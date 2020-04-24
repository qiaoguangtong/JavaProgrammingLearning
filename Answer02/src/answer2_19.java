import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_19 {
	public static void main(String[] args) {
		System.out.print("Enter three points for a triangle: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double s1 = distance(x1, y1, x2, y2);
		double s2 = distance(x1, y1, x3, y3);
		double s3 = distance(x2, y2, x3, y3);
		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
			System.out.println("Invalid triangle");
			System.exit(1);
		}
		double s = (s1 + s2 + s3) / 2;
		double area2 = s * (s - s1) * (s - s2) * (s - s3);
		double area = Math.pow(area2, 0.5);
		DecimalFormat f = new DecimalFormat("#.0");
		System.out.println("The area of the triangle is " + f.format(area));
	}

	static double distance(double x1, double y1, double x2, double y2) {
		double distance2 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		return Math.pow(distance2, 0.5);
	}
}
