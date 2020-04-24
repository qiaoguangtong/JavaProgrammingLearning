import java.util.Scanner;

public class answer6_21 {
	/** Return keybord number */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a String
		System.out.print("Enter a string: ");
		String phoneString = input.nextLine();
		String phoneNumber = new String();

		// Traverse the phoneString
		for (int index = 0; index < phoneString.length(); index++) {
			char uppercaseLetter = phoneString.charAt(index);
			if (uppercaseLetter >= 'a' && uppercaseLetter <= 'z' || uppercaseLetter >= 'A' && uppercaseLetter <= 'Z') {
				phoneNumber += Integer.toString(getNumber(uppercaseLetter));
			} else
				phoneNumber += Character.toString(uppercaseLetter);
		}
		System.out.println(phoneNumber);
	}

	/** Return the number on the phone keybord */
	public static int getNumber(char uppercaseLetter) {
		if ((uppercaseLetter <= 'Z' && uppercaseLetter >= 'A') || (uppercaseLetter <= 'z' && uppercaseLetter >= 'a')) {
			if (uppercaseLetter <= 'c' && uppercaseLetter >= 'a' || uppercaseLetter <= 'C' && uppercaseLetter >= 'A')
				return 2;
			if (uppercaseLetter <= 'f' && uppercaseLetter >= 'd' || uppercaseLetter <= 'F' && uppercaseLetter >= 'D')
				return 3;
			if (uppercaseLetter <= 'i' && uppercaseLetter >= 'g' || uppercaseLetter <= 'I' && uppercaseLetter >= 'G')
				return 4;
			if (uppercaseLetter <= 'l' && uppercaseLetter >= 'j' || uppercaseLetter <= 'L' && uppercaseLetter >= 'J')
				return 5;
			if (uppercaseLetter <= 'o' && uppercaseLetter >= 'n' || uppercaseLetter <= 'O' && uppercaseLetter >= 'M')
				return 6;
			if (uppercaseLetter <= 's' && uppercaseLetter >= 'p' || uppercaseLetter <= 'S' && uppercaseLetter >= 'P')
				return 7;
			if (uppercaseLetter <= 'v' && uppercaseLetter >= 't' || uppercaseLetter <= 'V' && uppercaseLetter >= 'T')
				return 8;
			if (uppercaseLetter <= 'z' && uppercaseLetter >= 'w' || uppercaseLetter <= 'Z' && uppercaseLetter >= 'W')
				return 9;
			else
				return 0;
		} else
			return 0;
	}
}
