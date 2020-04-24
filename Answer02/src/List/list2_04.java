package List;

import java.util.Scanner;

public class list2_04 {
	/** ComputeAreaWithConstant */
	public static void main(String[] args) {
		final double PI = 3.1415926;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * PI;

		// Display result
		System.out.println("The area for cirlce of radius " + radius + " is " + area);

	}
}
