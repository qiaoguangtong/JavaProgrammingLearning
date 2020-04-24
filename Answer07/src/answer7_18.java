import java.util.Scanner;

public class answer7_18 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		bubbleSort(numbers);

		// Display the result
		System.out.println("After the bubble sort: the numbers are: ");
		for (double e : numbers) {
			System.out.print(e + " ");
		}
	}

	/** Bubble Sort */
	public static void bubbleSort(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length- i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
