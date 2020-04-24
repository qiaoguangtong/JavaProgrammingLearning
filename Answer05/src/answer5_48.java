import java.util.Scanner;

public class answer5_48 {
	/** Process string */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		for (int index = 0; index < string.length(); index++) {
			if (index % 2 == 0)
				System.out.print(string.charAt(index));
		}
	}
}
