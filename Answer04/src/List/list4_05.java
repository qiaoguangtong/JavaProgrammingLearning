package List;

import java.util.Scanner;

public class list4_05 {
	/** LotteryUsingStrings */
	public static void main(String[] args) {
		// Generate a lottery as a two-digit string
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		String guess = input.nextLine();

		// Check if guess has tow digits
		if (guess.length() != 2) {
			System.out.println("You must enter two digits!");
			System.exit(1);
			// return;
		}

		// Get digits from lottery
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);

		// Get digits from guess
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);

		System.out.println("The lottery is " + lottery);

		// Check the guess
		if (guess.equals(lottery))
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
			System.out.println("Match all digts: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("No match: you win no dollar");
	}
}
