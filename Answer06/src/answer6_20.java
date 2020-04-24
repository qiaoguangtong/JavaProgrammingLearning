import java.util.Scanner;

public class answer6_20 {
	/** Calculate the number for a string */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a String
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		System.out.println("The count of the letters in the string \"" + string + "\" is " + countLetters(string));
	}

	/** Return the count of the letter in a string */
	public static int countLetters(String string) {
		int letterCount = 0;
		for (int index = 0; index < string.length(); index++) {
			if (string.charAt(index) <= 57 && string.charAt(index) >= 48) {
				letterCount++;
			}
		}
		return letterCount;
	}
}
