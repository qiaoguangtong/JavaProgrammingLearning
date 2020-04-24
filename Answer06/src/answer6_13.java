
public class answer6_13 {
	/** Sum series */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("i\t\t  m(i)");
		System.out.println("----------------------------------");

		// Display the table body
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-2d\t\t%6.3f", i, m(i));
			System.out.println();
		}
	}

	/** Return m(i) */
	public static double m(int i) {
		double result = 0;
		for (double index = 1; index <= i; index = index + 1) {
			result += (index) / (index + 1);
		}
		return result;
	}
}
