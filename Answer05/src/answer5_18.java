
public class answer5_18 {
	/** Display four patterns using loops */
	public static void main(String[] args) {

		// Pattern A
		// Display the table heading
		System.out.println("Pattern A");

		int line = 6;
		// Display the table body Pattern A
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-2d", j);
			}
			System.out.println();
		}

		System.out.println();

		// Pattern B
		// Display the table heading
		System.out.println("Pattern B");

		// Display the table body
		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-2d", j);
			}
			System.out.println();
		}

		System.out.println();
		// Pattern C
		// Display the table heading
		System.out.println("Pattern C");

		// Display the table body
		for (int i = 1; i <= line; i++) {
			for (int j = line - i; j >= 1; j--) {
				System.out.printf("%-2s", "");
			}
			// Display the number after the spaces
			for (int k = i; k >= 1; k--) {
				System.out.printf("%-2d", k);
			}
			System.out.println();
		}

		System.out.println();
		// Pattern D
		// Display the table heading
		System.out.println("Pattern D");

		// Display the table body
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("%-2s", "");
			}
			// Display the number after the spaces
			for (int k = 1; k <= line - i + 1; k++) {
				System.out.printf("%-2d", k);
			}
			System.out.println();
		}
	}
}
