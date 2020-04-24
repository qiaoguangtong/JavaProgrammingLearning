
public class answer7_09 {
	/** Find the smallest element */
	public static void main(String[] args) {
		double[] array = new double[10];
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The minimum number is " + min(array));
	}

	/** Return the minimum number in the array */
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}
}