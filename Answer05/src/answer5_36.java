import java.util.Scanner;

public class answer5_36 {
	/** Business application: checking ISBN */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a ISBN
		System.out.print("Enter a ISBN: ");
		String ISBN = input.nextLine();

		if (ISBN.length() != 9) {
			System.out.println("Input invalid!");
			System.exit(0);
		}

		long sum = 0;
		for (int i = 0; i < ISBN.length(); i++) {
			sum += (i + 1) * Character.getNumericValue(ISBN.charAt(i));
		}
		int remainder = (int) (sum % 11);
		if (remainder == 10)
			System.out.println("The ISBN-10 number is " + ISBN + "X");
		else
			System.out.println("The ISBN-10 number is " + ISBN + Integer.toString(remainder));
	}
}
