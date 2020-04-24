package List;

import java.util.Scanner; // Scanner is in the java.util package

public class list2_02 {
	/** ComputeAreaWithConsole */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for raius: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * 3.14159;

		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);

	}
}
