package List;

import java.util.Scanner;

public class list5_02 {
	/** GuessNumberOnTime */
	public static void main(String[] args) {
		// Generate one number to be guessed
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number from 0 to 100: ");

		// Prompt the user to guess the number
		System.out.println("\nEnter your guess: ");
		int guess = input.nextInt();

		if (guess == number)
			System.out.println("Yes, the number is " + number);
		else if (guess > number)
			System.out.println("Your guess is too high");
		else if (guess < number)
			System.out.println("Your guess is too low");

	}
}
