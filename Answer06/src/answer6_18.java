import java.util.Scanner;

public class answer6_18 {
	/** Check password */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String password = input.nextLine();
		if (checkPassword(password)) {
			System.out.println("Valid Password");
		} else
			System.out.println("Invalid Password");
	}

	/**
	 * Check the password, if right, return true else return false
	 */
	public static boolean checkPassword(String password) {
		if (password.length() < 8) // Length must be greater than 8;
			return false;
		int letterCount = 0, numCount = 0;
		for (int index = 0; index < password.length(); index++) {
			if (password.charAt(index) <= 57 || password.charAt(index) >= 48) {
				numCount++;
			}
			if (password.charAt(index) <= 90 && password.charAt(index) >= 65
					|| password.charAt(index) >= 97 && password.charAt(index) <= 122) {
				letterCount++;
			}
		}
		if (password.length() == letterCount + numCount && letterCount != 0 && numCount > 1)
			return true;
		return false;
	}
}
