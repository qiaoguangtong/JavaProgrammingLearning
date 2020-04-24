package answer.learning.list;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Quotient {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		input.close();
	}
}
