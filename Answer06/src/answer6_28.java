
public class answer6_28 {
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("p \t\t 2^p-1");
		System.out.println("------------------------");
		for (int i = 2; i <= 31; i++) {
			if (isPrime((int) Math.pow(2, i) - 1)) {
				System.out.println(i + " \t\t " + ((int) Math.pow(2, i) - 1));
			}
		}
	}

	/** Decide if the number n is prime number */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2 + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
