
public class answer5_03 {
	/** Conversion from kilograms to pounds */
	public static void main(String[] args) {
		// Define a constant for conversion
		final double POUNDS_PER_KILOGRAM = 2.2;

		// Display the table heading
		System.out.println("Kilograms\tPounds");

		// Display the table body
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%d\t\t%.1f\n", i, i * POUNDS_PER_KILOGRAM);
		}
	}
}
