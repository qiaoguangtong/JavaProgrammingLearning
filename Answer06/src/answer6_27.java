
public class answer6_27 {
	public static void main(String[] args) {
		final int COUNT = 100;
		final int NUMBERS_PER_LINE = 10;
		int count = 0;
		for (int i = 2; i >= 0 && count < COUNT; i++) {
			if (isPrime(i) && isOppositePrime(i) && !isPlalindrome(i)) {
				count++;
				System.out.print(i + " ");
				if (count % NUMBERS_PER_LINE == 0)
					System.out.println();
			}

		}
	}

	/** Decide if the opposite number is prime number */
	public static boolean isOppositePrime(int n) {
		String strNumber = Integer.toString(n);
		String opposite = new String();
		for (int index = 0; index < strNumber.length(); index++) {
			opposite = Character.toString(strNumber.charAt(index)) + opposite;
		}
		int oppositeNumber = Integer.parseInt(opposite);
		if (isPrime(oppositeNumber))
			return true;
		return false;
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

	/** Decide if the string is plalindrome */
	public static boolean isPlalindrome(int n) {
		String str = Integer.toString(n);
		if(str.length()==1) {
			return true;
		}
		int low = 0;
		int high = str.length() - 1;
		while(low < high) {
			if(str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	
}
