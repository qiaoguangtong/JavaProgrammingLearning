
public class answer5_19 {
	/** Display numbers in a pyramid pattern */
	public static void main(String[] args) {

		int line = 8;

		for (int i = 0; i < line; i++) {
			// Display the indentation spaces
			for (int j = line - i; j >= 2; j--) {
				System.out.printf("%4s", "");
			}

			// Display the numbers
			for (int k = 0; k <= i; k++) {
				System.out.printf("%4d", (int) (Math.pow(2, k)));
			}

			for (int l = i - 1; l >= 0; l--) {
				System.out.printf("%4d", (int) (Math.pow(2, l)));
			}
			System.out.println();
		}
	}
}
