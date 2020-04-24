
public class answer5_06 {
	/** Conversion from miles to kilometers */
	public static void main(String[] args) {
		// Define two constants
		final double MILES_PER_KILOMETER = 1 / 1.609;
		final double KILOMETERS_PER_MILE = 1.069;

		// Display the table heading
		System.out.println("Miles\tKilometers\t|  Kilometers\tMiles");

		// Display the table body
		for (int i = 1, j = 20; i < 11; i++, j += 5) {
			System.out.printf("%-5d\t%9.3f\t|  %-9d\t%5.3f\n", i, i * KILOMETERS_PER_MILE, j, j * MILES_PER_KILOMETER);
		}
	}
}
