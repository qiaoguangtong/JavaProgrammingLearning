
public class answer5_26 {
	/** Compute e */
	public static void main(String[] args) {
		double e = 1;
		for (int i = 1; i <= 100000; i++) {
			double f = 1;
			for (int k = i; k >= 1; k--) {
				// Calculate the factorial
				f = f * k;
			}
			e = e + 1.0 / f;
			if (i % 10000 == 0) {
				System.out.println("While i = " + i + ", e = " + e);
			}
		}
		//System.out.println(Math.E);
	}
}
