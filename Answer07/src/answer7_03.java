import java.util.Arrays;
import java.util.Scanner;

public class answer7_03 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] integers = new int[1024];

		// Enter the integers
		int index;
		for (index = 0; index < integers.length; index++) {
			integers[index] = input.nextInt();
			if (integers[index] == 0) {
				break;
			}
			if (integers[index] > 100 || integers[index] < 1) {
				System.out.println("ERROR!! Please enter the integers betweeen 1 and 100!");
				System.exit(0);
			}
		}
		int[] numbers = new int[index];
		for (int i = 0; i < index; i++) {
			numbers[i] = integers[i];
		}
		Arrays.parallelSort(numbers);
		// Find the numbers and record the count
		int[] count = new int[index];
		Arrays.fill(count, 0);
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (numbers[j] == numbers[i]) {
					count[i]++;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			for (int j = i + 1; j < count.length; j++) {
				if (numbers[j] == numbers[i]) {
					numbers[j] = 0;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			if (numbers[i] != 0 && count[i] > 1) {
				System.out.println(numbers[i] + " occurs " + count[i] + " times");
			} else if (numbers[i] != 0 && count[i] == 1) {
				System.out.println(numbers[i] + " occurs " + count[i] + " time");
			}
		}
//		for (int i = 0; i < count.length; i++) {
//			System.out.println(count[i] + "" + numbers[i]);
//		}

	}

}
