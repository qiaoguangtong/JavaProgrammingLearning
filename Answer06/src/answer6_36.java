import java.util.Scanner;

public class answer6_36 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of sides and the lenth for the side;
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the polygon is " + area(n, side));
	}

	public static double area(int n, double side) {
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return area;
	}
}
