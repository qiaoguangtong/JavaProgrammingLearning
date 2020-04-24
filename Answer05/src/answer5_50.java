import java.util.Scanner;

public class answer5_50 {
	/** Count uppercase */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		int upperCaseCount = 0;
		for (int index = 0; index < string.length(); index++) {
			if (string.charAt(index) == ' ') {
				continue;
			}
			if (Character.toUpperCase(string.charAt(index)) == string.charAt(index)) {
				upperCaseCount++;
			}
		}
		System.out.println("The number of uppercase letters is " + upperCaseCount);

	}
}
