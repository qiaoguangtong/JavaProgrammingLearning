
public class answer5_04 {
	/** Conversion from miles to kilometers */
	public static void main(String[] args) {
		// Create a constant
		final double KILOMETERS_PER_MILE = 1.609;

		// Display the table heading
		System.out.println("Miles\t\tKilometers");

		// Display the table body
		for (int i = 1; i < 11; i++) {
			System.out.printf("%1d\t\t%.3f\n", i, i * KILOMETERS_PER_MILE);
		}
	}
}
