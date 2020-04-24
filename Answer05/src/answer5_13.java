
public class answer5_13 {
	/** Find the largest integer n such that n*n*n < 12,000 */
	public static void main(String[] args) {
		int n = 1;
		while (n * n * n < 12000) {
			n++;
		}
		System.out.println("The largest integer n is " + n);
	}
}
