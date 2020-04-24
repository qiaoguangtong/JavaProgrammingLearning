
public class answer5_20 {
	/** Display prime numbers between 2 and 1000 */
	public static void main(String[] args) {
		int count = 0;
		final int NUMBERS_PER_LINE = 8;
		int limits = 1000;

		// For loop
		for (int i = 2; i < limits + 1; i++) {
			boolean isPrime = true;
			// Whether the number is prime
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				count++;
				System.out.print(i + "\t");
				if (count % NUMBERS_PER_LINE == 0) {
					System.out.println();
				}
			}
		}
	}
}
