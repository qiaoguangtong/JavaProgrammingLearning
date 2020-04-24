
public class answer5_39 {
	/** Financial application: find the sales amount */
	public static void main(String[] args) {
		double baseSalary = 5000;
		double push = 0;
		double push0 = 0;
		while (push0 <= 25000) {
			if (push <= 5000) {
				push0 = push * 0.08;
			} else if (push > 5000 && push <= 10000) {
				push0 = 5000 * 0.08 + (push - 5000) * 0.10;
			} else {
				push0 = 5000 * 0.08 + (10000 - 5000) * 0.10 + (push - 10000) * 0.12;
			}
			push = push+0.01;
		}
		System.out.printf("If you wanna earn $30,000 a year, your minimum sales should be $%.3f",push);
	}
}