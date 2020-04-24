import java.util.Scanner;

public class answer5_14 {
	/** Compute the greatest common divisor */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int n2 = input.nextInt();

		int d = Math.min(n1, n2);
		while (true) {
			if (n1 % d == 0 && n2 % d == 0) {
				break;
			}
			d--;
		}
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);
	}
}
