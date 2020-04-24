
public class answer7_20 {
	public static void main(String[] args) {
		// Create a Scanner
		// Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10000) /100.0;
			System.out.print(numbers[i] + " ");
		}

		selectionSort(numbers);

		System.out.println();
		System.out.print("The numbers sorted are: ");
		for (double e : numbers) {
			System.out.print(e + " ");
		}
	}

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length - 1]
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			// Swap list[currentMinIndex] and list[i] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
