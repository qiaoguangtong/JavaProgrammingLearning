import java.util.Scanner;

public class answer6_02 {
	/** Sum the digits in an integer */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		long integer = input.nextLong();

		System.out.println("The sum of the digits is " + sumDigits(integer));
	}

	public static int sumDigits(long n) {
		String str = Long.toString(n);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int d = Character.getNumericValue(str.charAt(i));
			sum += d;
		}
		return sum;
	}
}
