import java.util.Scanner;

public class answer5_16 {
	/** Find the factors of an integer */
	public static void main(String[] args) {
		int sFactor = 2; // Smallest factor
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		if (integer == 1) {
			System.out.println("The factor is only one, which is 1");
			System.exit(0);
		}
		System.out.println("The factors are: ");
		while (integer != 1) {
			while (integer % sFactor == 0) {
				System.out.print(sFactor + " ");
				integer /= sFactor;
			}
			sFactor++;
		}
	}
}
