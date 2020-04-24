import java.util.Scanner;

public class answer5_47 {
	/** Business: check ISBN-13 */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the use to enter the first 12 digits of an ISBN-13 as a string
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");

		String ISBN = input.nextLine();

		// Check the length of the ISBN
		if (ISBN.length() != 12) {
			System.out.println(ISBN + " is an invalid input");
			System.exit(0);
		}

		int sum = 0;
		for (int index = 0; index < ISBN.length(); index++) {
			if ((index + 1) % 2 == 0)
				sum += 3 * Integer.parseInt(Character.toString(ISBN.charAt(index)));
			else
				sum += Integer.parseInt(Character.toString(ISBN.charAt(index)));
		}
		int checksum = 10 - sum % 10;
		if (checksum == 10) {
			checksum = 0;
		}
		System.out.println("The ISBN-13 number is " + ISBN + checksum);

	}
}
