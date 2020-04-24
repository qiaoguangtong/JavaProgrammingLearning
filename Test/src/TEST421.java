import java.util.Scanner;

/** Check the SSN */
public class TEST421 {
	public static void main(String[] args) {
		// Create a Sacnner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssnString = input.nextLine();

		if (ssnString.length() != 11) {
			//System.out.println("INPUT ERROR!");
			System.out.println(ssnString + " is an invalid social security number");
			System.exit(0);
		}

		if (ssnString.charAt(3) != '-' || ssnString.charAt(6) != '-') {
			System.out.println(ssnString + " is an invalid social security number");
			System.exit(0);
		}
		boolean isValid = true;
		for (int i = 0; i < 3; i++) {
			if (ssnString.charAt(i) > '9' || ssnString.charAt(i) < '0')
				isValid = false;
		}
		if (isValid) {
			for (int i = 4; i < 6; i++) {
				if (ssnString.charAt(i) > '9' || ssnString.charAt(i) < '0')
					isValid = false;
			}
			if (isValid) {
				for (int i = 7; i < 11; i++) {
					if (ssnString.charAt(i) > '9' || ssnString.charAt(i) < '0')
						isValid = false;
				}
			}
		}
		if (isValid) {
			System.out.println(ssnString + " is a valid social security number");
		} else
			System.out.println(ssnString + " is an invalid social security number");
	}
}
