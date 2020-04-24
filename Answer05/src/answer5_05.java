
public class answer5_05 {
	/** Conversion from kilograms to pounds and from pounds to kilograms; */
	public static void main(String[] args) {
		// Define two constant
		final double POUNDS_PER_KILOGRAM = 2.2;
		final double KILOGRAMS_PER_POUND = 1 / 2.2;

		// Display the table heading
		System.out.println("Kilograms\tPounds\t|  Pounds\tKilometers");

		// Display the table body
		for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
			System.out.printf("%-9d\t%.1f\t|  %-6d\t%9.2f\n", i, i * POUNDS_PER_KILOGRAM, j, j * KILOGRAMS_PER_POUND);
		}
	}
}
