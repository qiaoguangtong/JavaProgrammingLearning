
public class answer7_06 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		int[] primeNumbers = new int[NUMBER_OF_PRIMES];
		while (count < NUMBER_OF_PRIMES) {
			if (isPrime(number)) {
				primeNumbers[count] = number;
				count++;
			}
			number++;
		}

		System.out.println("The 50 prime numbers are: ");
		for (int i = 0; i < primeNumbers.length; i++) {
			System.out.print(primeNumbers[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

	/** Decide if the number is prime number */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
