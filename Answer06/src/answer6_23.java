import java.util.Scanner;

public class answer6_23 {
	/** The specific characters in a string */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the check information
		System.out.println("Enter a string: ");
		String newString = input.nextLine();
		System.out.println("Enter a character which you wanna check: ");
		String character = input.next();
		char c = character.charAt(0);
		// Display the results
		System.out.print("The count for the character \"" + c + "\" is " + count(newString, c));
	}

	/** Return the count */
	public static int count(String str, char argc) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == argc) {
				count++;
			}
		}
		return count;
	}
}
