import java.text.DecimalFormat;
import java.util.Scanner;

public class answer7_11 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		// Prompt the user to enter some numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		DecimalFormat format = new DecimalFormat("#.00000");
		// Display the result
		System.out.println("The mean is " + format.format(mean(numbers)));
		System.out.println("The standard deviation is " + format.format(deviation(numbers)));
	}

	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double sum = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++) {
			sum += Math.pow(x[i] - mean, 2);
		}
		double deviation = Math.pow(sum / (x.length - 1), 0.5);
		return deviation;
	}

	/** Compute the mean of an array of double value */
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		return sum / x.length;
	}
}
