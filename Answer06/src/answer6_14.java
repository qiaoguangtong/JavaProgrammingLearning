
public class answer6_14 {
	/** Approximate PI */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("i \t\t m(i)");
		System.out.println("-----------------------------------");
		// Display the table body
		for (int i = 1; i < 1000; i = i + 100)
			System.out.printf("%d \t\t%.4f\n", i, m(i));
	}

	/** Return pi */
	public static double m(int i) {
		double mi = 0;
		for (double index = 1; index <= i; index = index + 1) {
			mi = mi + Math.pow(-1, index + 1) / (2 * index - 1);
		}
		return 4 * mi;
	}

}
