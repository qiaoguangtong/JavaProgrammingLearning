import java.util.Scanner;

public class answer5_49 {
	/** Count vowels and consonants */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		int vowelCount = 0;
		int consonantCount = 0;
		for (int index = 0; index < string.length(); index++) {
			if (Character.toUpperCase(string.charAt(index)) == 'A' || Character.toUpperCase(string.charAt(index)) == 'E'
					|| Character.toUpperCase(string.charAt(index)) == 'I'
					|| Character.toUpperCase(string.charAt(index)) == 'O'
					|| Character.toUpperCase(string.charAt(index)) == 'U')
				vowelCount++;
			else if (string.charAt(index) != ' ')
				consonantCount++;
		}
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);

	}
}
