import java.util.Scanner;

public class answer6_22 {
	/** Mathematics: approximate the square root */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a long number
		System.out.print("Enter a long number: ");
		long number = input.nextLong();

		System.out.println("The square root for the long number " + number + " is " + sqrt(number));
	}

	/** Return the square root for a long integer number */
	public static double sqrt(long n) {
		double nextGuess = 1;
		for (double lastGuess = 1; lastGuess >0; lastGuess += 0.001) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(lastGuess - nextGuess) < 0.001)
				break;
		}
		return nextGuess;
	}
}
