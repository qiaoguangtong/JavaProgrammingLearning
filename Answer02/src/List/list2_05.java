package List;

import java.util.Scanner;

public class list2_05 {
	/** DisplayTime */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();

		int minutes = seconds / 60; // Find minutes in seconda
		int remainingSeconds = seconds % 60; // Seconds remaining
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

	}
}