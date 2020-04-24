package List;

import java.util.Scanner;

public class list6_06 {
	/** GreatestCommonDivisorMethod */
	public static void main(String[] args) {/** Main method */
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter the first integer: ");
		int integer1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int integer2 = input.nextInt();

		System.out.println(
				"The greatest common divisor for " + integer1 + " and " + integer2 + " is " + gcd(integer1, integer2));
	}

	/** GreatestCommonDivisorMethod */
	public static int gcd(int n1, int n2) {
		int gcd = 1; // Initialize the gcd is 1
		int k = 2; // Initialize the k is 2
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k; // Update gcd
			}
			k++;
		}

		return gcd; // Return gcd
	}
}
