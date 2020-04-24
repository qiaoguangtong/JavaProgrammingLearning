package answer.homework.practice;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_08 {
	/** Hex2Dec */
	public static void main(String[] args) throws NumberFormatException {
		try {
			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Prompt the user enter a string
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();

			System.out.println("The decimal value for index number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		if (isHex(hex)) {
			int decimalValue = 0;
			for (int i = 0; i < hex.length(); i++) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}

			return decimalValue;
		} else {
			throw new NumberFormatException(hex);
		}
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else {
			// ch is '0', '1', ..., or '9'
			return ch - '0';
		}
	}

	public static boolean isHex(String s) {
		boolean bool = false;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) <= 'F' && s.charAt(i) >= 'A') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'f')
					|| (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				bool = true;
			} else {
				bool = false;
				break;
			}
		}

		return bool;
	}
}

class NumberFormatException extends Exception {
	private String str;

	public NumberFormatException(String string) {
		super("Number Format ERROR: " + string);
		this.str = string;
	}

	public String getString() {
		return str;
	}
}