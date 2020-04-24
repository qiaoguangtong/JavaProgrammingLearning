import java.util.Scanner;

public class answer6_37 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// prompt the user enter a number and the width
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		System.out.print("Enter the width: ");
		int width = input.nextInt();

		// Display the result
		System.out.print("The result is " + format(number, width));
	}

	public static String format(int number, int width) {
		String str = new String();
		String strNumber = Integer.toString(number);
		if (strNumber.length() > width) {
			return strNumber;
		}
		str = strNumber;
		int length = str.length();
		
		for (int index = 0; index < width - length; index++) {
			str = "0" + str;
		}
		return str;
	}
}
