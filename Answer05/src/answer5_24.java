
public class answer5_24 {
	/** Sum a series */
	public static void main(String[] args) {
		double sum = 0;
		for (double i = 1; i < 50; i = i + 1.0) {
			sum += (2 * i - 1) / (2 * i + 1);
		}
		System.out.println(sum);
	}
}
