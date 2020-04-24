import java.text.DecimalFormat;

public class answer5_07 {
	/** Financial application: compute future tuition */
	public static void main(String[] args) {
		double tuition = 10000;
		double rate = 0.05;
		double totalInFour = 0;
		double tuition10 = 0;

		for (int i = 1; i < 15; i++) {
			tuition *= (1 + rate);
			if (i == 10)
				tuition10 = tuition;
			if (i > 10)
				totalInFour += tuition;
		}

		DecimalFormat format = new DecimalFormat();
		System.out.println("The tuition in ten years are $" + format.format(tuition10)
				+ "\nThe tuition for the fourth years in ten years are $" + format.format(totalInFour));
	}
}
