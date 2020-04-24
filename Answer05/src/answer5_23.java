
public class answer5_23 {
	/** Demonstrate cancellation errors */
	public static void main(String[] args) {
		int n = 5000;
		// From left to right
		double sum1 = 0;
		for (int i = 1; i <= n; i++) {
			sum1 = sum1 + 1.0 / i;
		}
		System.out.println(sum1);

		// From right to left
		double sum2 = 0;
		for (int i = n; i >= 1; i--) {
			sum2 = sum2 + 1.0 / i;
		}
		System.out.println(sum2);

	}
}
