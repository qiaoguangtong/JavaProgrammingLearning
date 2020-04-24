package answer.learning.list;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class QuotientWithIF {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers 
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number2 != 0) {
			System.out.print(number1 + " / " + number2 + " is " + (number1 / number2));
		}else {
			System.out.println("The divisor cannot be zero");
		}
		
		input.close();
	}
}
