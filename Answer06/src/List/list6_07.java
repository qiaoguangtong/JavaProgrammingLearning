package List;

public class list6_07 {
	/** PrimeNumberMethod */
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are: ");
		printPrimeNumbers(50);
	}

	/** printPrimeNumber method */

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBERS_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime numbers and increase count
			if (isPrime(number)) {
				count++; // Increase the count
				if (count % NUMBERS_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				} else
					System.out.printf("%-5s", number);
			}

			// Check whether the next number is prime
			number++;
		}
	}

	/** isPrime method */
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
}
