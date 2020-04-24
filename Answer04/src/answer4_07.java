import java.util.Scanner;

public class answer4_07 {
	public static void main(String[] args) {
		System.out.print("Enter the radius of the bounding circle: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		System.out.println("The coordinates of five points on pentagon are ");
		double angle = Math.PI / 2.5;
		double rAngle = Math.PI / 2;
		double a1 = rAngle - angle;
		double a2 = rAngle;
		double a3 = rAngle + angle;
		double a4 = rAngle + 2 * angle;
		double a5 = rAngle - 2 * angle;
//		System.out.println("(" + radius * Math.cos(a1) + ", " + radius * Math.sin(a1) + ")");
//		System.out.println("(" + radius * Math.cos(a2) + ", " + radius * Math.sin(a2) + ")");
//		System.out.println("(" + radius * Math.cos(a3) + ", " + radius * Math.sin(a3) + ")");
//		System.out.println("(" + radius * Math.cos(a4) + ", " + radius * Math.sin(a4) + ")");
//		System.out.println("(" + radius * Math.cos(a5) + ", " + radius * Math.sin(a5) + ")");
		System.out.printf("(%.3f, %.4f)\n", radius * Math.cos(a1), radius * Math.sin(a1));
		System.out.printf("(%.10f, %.0f)\n", radius * Math.cos(a2), radius * Math.sin(a2));
		System.out.printf("(%.3f, %.4f)\n", radius * Math.cos(a3), radius * Math.sin(a3));
		System.out.printf("(%.3f, %.4f)\n", radius * Math.cos(a4), radius * Math.sin(a4));
		System.out.printf("(%.3f, %.4f)\n", radius * Math.cos(a5), radius * Math.sin(a5));

	}
}
