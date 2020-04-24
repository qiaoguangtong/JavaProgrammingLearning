public class answer7_10 {
	/** Find the index of the smallest element */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("The index of the smallest element is " + indexOfSmallestElement(numbers));
	}

	/** Return the index of the smallest element */
	public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
}