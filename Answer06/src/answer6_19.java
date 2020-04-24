import java.util.Scanner;

public class answer6_19 {
	/** MyTriangle class */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides for a triangle
		System.out.print("Enter three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (MyTriangle.isValid(side1, side2, side3)) {
			System.out.println("The area for this triangle is " + MyTriangle.area(side1, side2, side3));
		} else {
			System.out.println("Invalid Triangle");
		}

	}

}

class MyTriangle {
	/**
	 * Return true if the sum of any two sides is greater than the third side.
	 */
	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			return true;
		} else
			return false;
	}

	/**
	 * Return the area of the triangle.
	 */
	public static double area(double side1, double side2, double side3) {
		double side = (side1 + side2 + side3) / 2;
		double area2 = side * (side - side1) * (side - side2) * (side - side3);
		double area = Math.pow(area2, 0.5);
		return area;
	}

}
