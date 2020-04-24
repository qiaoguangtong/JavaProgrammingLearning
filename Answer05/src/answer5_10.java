
public class answer5_10 {
	/** Find numbers divisible by 5 and 6 */
	public static void main(String[] args) {
		int divisor1 = 5;
		int divisor2 = 6;
		int count = 0;

		for (int i = 100; i < 1001; i++) {
			if (i % divisor1 == 0 && i % divisor2 == 0) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) // newline
					System.out.println();
			}
		}
	}
}
