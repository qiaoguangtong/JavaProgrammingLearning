import java.util.Scanner;

public class answer5_51 {
	/** Longest common prefix */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two strings
		System.out.print("Enter the first string: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = input.nextLine();
		if (string1.charAt(0) != string2.charAt(0)) {
			System.out.println(string1 + " and " + string2 + " hava no common prefix");
			System.exit(0);
		}

		System.out.print("The common prefix is ");
		for (int index = 0; index < Math.min(string1.length(), string2.length()); index++) {
			if (string1.charAt(index) == string2.charAt(index))
				System.out.print(string1.charAt(index));
			else if (string1.charAt(index) != string2.charAt(index))
				break;
		}

	}
}
