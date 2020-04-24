import java.util.Scanner;

public class answer6_31 {
	/** Financial application: */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the credit card number
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		if (isValid(number)) {
			System.out.println(number + " is valid card number");
		} else {
			System.out.println(number + " is invalid card number");
		}
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		String str = Long.toString(number);
		if (str.length() < 13 || str.length() > 16) {
			return false;
		}

		if ((prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
				|| prefixMatched(number, 6))) {
			return false;
		}

		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		if (sum % 10 == 0) {
			return true;
		}

		return false;
	}

	/** Get the result from the Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String str = Long.toString(number);
		for (int index = 0; index < str.length(); index += 2) {
			int temp = 2 * Character.getNumericValue(str.charAt(index));
			sum += getDigit(temp);
		}
		return sum;
	}

	/**
	 * Return this number if it is single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		if (number > 9) {
			return number / 10 + number % 10;
		}
		return number;
	}

	/** Return sum of the odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String str = Long.toString(number);
		for (int index = 1; index < str.length(); index += 2) {
			int temp = Character.getNumericValue(str.charAt(index));
			sum += temp;
		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		String str = Long.toString(number);
		String dStr = Integer.toString(d);
		if (str.startsWith(dStr)) {
			return true;
		}
		return false;
	}

	/** Return the number of digit in d */
	public static int getSize(long d) {
		String str = Long.toString(d);
		int sum = str.length();
		return sum;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		return 0;
	}

}
