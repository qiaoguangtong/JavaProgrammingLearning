package List;

public class list5_08 {
	/** TestSum */
	public static void main(String[] args) {
		// Initial sum
		float sum = 0;

		// Add 0.01, 0.02 .....0.99, 1.00 to sum
		for (float i = 0.01f; i <= 1; i += 0.01f)
			sum += i;

		// Display result
		System.out.println("The sum is " + sum);
	}
}
