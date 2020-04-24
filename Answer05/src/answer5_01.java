import java.util.Scanner;

public class answer5_01 {
	/** Count positive and negative numbers and compute the average of numbers */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// The count for positive, negative, and total
		int posiCount = 0;
		int negaCount = 0;
		int count = 0;

		// Declare sum
		double total = 0;
		double average = 0;

		// Prompt the user to enter numbers
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}
		while (number != 0) {
			if (number > 0)
				posiCount++;
			else if (number < 0)
				negaCount++;
			total += number;
			count++;
			number = input.nextInt();
		}
		average = total / count;
		System.out.println("The number of positive is " + posiCount);
		System.out.println("The number of negative is " + negaCount);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
