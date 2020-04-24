import java.util.Scanner;

public class answer6_06 {
	/** Display patterns */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of layers: ");
		int n = input.nextInt();

		displayPattern(n);
	}

	/** Display the pattern */
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.printf("%-3s", "");
			}
			for (int k = i; k >= 1; k--) {
				System.out.printf("%-3s", k);
			}
			System.out.println();
		}
	}
}
