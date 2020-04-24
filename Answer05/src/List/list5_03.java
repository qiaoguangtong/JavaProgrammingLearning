package List;

import java.util.Scanner;

public class list5_03 {
	/** GuessNumber */
	public static void main(String[] args) {
		// Generate a number to be guessed
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (number != guess) {
			// Prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();

			if (number == guess)
				System.out.println("Yes, the number is " + number);
			else if (number < guess)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
	}
}
