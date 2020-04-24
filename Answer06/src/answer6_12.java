import java.util.Scanner;

public class answer6_12 {
	/** Display characters */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter sth.
		System.out.print("Enter the start character: ");
		String startString = input.next();
		char start = startString.charAt(0);

		System.out.print("Enter the end character: ");
		String endString = input.next();
		char end = endString.charAt(0);

		System.out.print("Enter the number per line for displaying: ");
		int numberPerLine = input.nextInt();

		printCharacter(start, end, numberPerLine);
	}

	/** Print characters */
	public static void printCharacter(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for (char c = ch1; c <= ch2; c++) {
			System.out.print(c + " ");
			count++;
			if (count % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
}
