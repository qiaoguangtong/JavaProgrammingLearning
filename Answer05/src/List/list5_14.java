package List;

import java.util.Scanner;

public class list5_14 {
	/** Palindrome */
	public static void main(String[] args) { /** Main method */
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		// The index of the last character in the string
		int high = str.length() - 1;
		int low = 0;
		boolean isPalindrome = true;
		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if (isPalindrome)
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");
	}
}
