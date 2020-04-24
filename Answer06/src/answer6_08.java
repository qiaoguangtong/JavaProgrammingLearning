
public class answer6_08 {
	/** Conversions between Celsius and Fahrenheit */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("Celsius \tFahrenheit\t|\tFhrenheit\tCelsius");

		// Display the table body
		for (double i = 40, j = 120; i >= 31 && j >= 30; i = i - 1, j = j - 10) {
			System.out.printf("%-8.1f\t%-10.1f\t|\t%-10.1f\t%.2f", i, celsiusToFahrenheit(i), j,
					fahrenheitToCelsius(j));
			System.out.println();
		}
	}

	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		double fahrentheit = (9.0 / 5) * celsius + 32;
		return fahrentheit;
	}

	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}
