
public class answer6_26 {
	public static void main(String[] args) {

		final int NUMBER_PER_LINE = 10;
		int count = 0;
		for (int index = 2; index < 1000000; index++) {
			if (isPrime(index)) {
				String str = Integer.toString(index);
				if (isPlalindrome(str)) {
					count++;
					System.out.print(str + " ");
					if (count % NUMBER_PER_LINE == 0) {
						System.out.println();
					}
					if (count == 100)
						return;
				}
			}
		}
	}

	/** Decide if n is prime number */
	public static boolean isPrime(int n) {
		for (int index = 2; index < n / 2 + 1; index++) {
			if (n % index == 0) {
				return false;
			}
		}
		return true;
	}

	/** Decide if the string is plalindrome */
	public static boolean isPlalindrome(String str) {
		int low = 0;
		int high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
}
