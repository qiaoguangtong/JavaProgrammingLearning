
public class answer5_25 {
	/** Computer PI */
	public static void main(String[] args) {
		double quarterPI = 0;
		for (int i = 1; i <= 100000; i++) {
			quarterPI += (Math.pow(-1, i + 1)) / (2 * i - 1);
			if (i % 10000 == 0) {
				System.out.println("While i = " + i + ", the PI is " + 4 * quarterPI);
			}
		}
	}
}
