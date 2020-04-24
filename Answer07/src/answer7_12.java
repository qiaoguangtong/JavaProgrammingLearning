import java.text.DecimalFormat;

public class answer7_12 {
	/** Reverse an array */
	public static void main(String[] args) {
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		java.util.Scanner input = new java.util.Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		DecimalFormat format = new DecimalFormat();
		System.out.print("The reversal array is ");
		for (double e : reverse(numbers)) {
			System.out.print(format.format(e) + " ");
		}
	}

	/** Return the reversal array */
	public static double[] reverse(double[] array) {
		double[] reverse = new double[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = array[i];
		}
		return reverse;
	}
}
