
public class answer5_12 {
	/** Find the smallest n such that n*n > 12,000 */
	public static void main(String[] args) {
		int n = 1;
		while (n * n <= 12000) {
			n++;
		}
		System.out.println("The smallest n is " + n);
	}
}
