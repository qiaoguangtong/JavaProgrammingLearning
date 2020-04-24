
public class answer6_29 {
	public static void main(String[] args) {
		for (int i = 2; i + 2 <= 1000; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
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
