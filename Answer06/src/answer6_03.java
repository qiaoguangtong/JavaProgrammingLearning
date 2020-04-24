import java.util.Scanner;

public class answer6_03 {
	/** Palindrome integer */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		System.out.println("Is the integer " + integer + " is palindrome integer? \n" + isPalindrome(integer));
	}

	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		String str0 = Integer.toString(number);
		String str1 = new String();
		for (int index = 0; index < str0.length(); index++) {
			str1 = Character.toString(str0.charAt(index)) + str1;
		}
		int reverseNumber = Integer.parseInt(str1);
		return reverseNumber;
	}

	// Return true if number is palindrome
	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}
}
