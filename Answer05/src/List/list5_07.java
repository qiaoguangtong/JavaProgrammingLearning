package List;

public class list5_07 {
	/** MultiplicationTable */
	public static void main(String[] args) { /** Main method */
		// Display the table heading
		System.out.println("              Multiplication table ");

		// Display the number title
		System.out.print("     ");
		for (int j = 1; j <= 9; j++)
			System.out.print("    " + j);
		System.out.println();
		// System.out.println("\n--------------------------------------------------");
		for (int a = 1; a <= 10; a++)
			System.out.print("-----");
		System.out.println();
		// Display the table body
		for (int i = 1; i <= 9; i++) {
			System.out.print("  " + i + " |");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}

	}
}
