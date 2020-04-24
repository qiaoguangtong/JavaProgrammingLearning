import List.list6_07;

public class answer6_10 {
	/** Use the isPrime Method */
	public static void main(String[] args) {
		System.out.println("The prime numbers less than 10,000 are:");
		int count = 0;
		for (int index = 2; index < 10000; index++) {
			if (list6_07.isPrime(index)) {
				System.out.print(index + "\t");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}
}
