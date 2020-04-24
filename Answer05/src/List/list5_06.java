package List;

import java.util.Scanner;

public class list5_06 {
	/** TestdoWhile */
	public static void main(String[] args) { /** Main method */
		int data = 0;
		int sum = 0;

		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Keep reading data until the input is 0
		do {
			// Read the next data
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();

			sum += data;
		} while (data != 0);
		
		System.out.println("The sum is " + sum);
	}
}
