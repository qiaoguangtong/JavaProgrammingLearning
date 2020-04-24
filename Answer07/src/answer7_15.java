import java.util.Arrays;
import java.util.Scanner;

public class answer7_15 {
	/** Delete the repeat number */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = input.nextInt();
		}

		System.out.print("The distinct numbers are: ");
		for (int n : eliminateDuplicates(numbers)) {
			if (n == -1) {
				break;
			}
			System.out.print(n + " ");
		}
	}

	/** Eliminate the duplicates */
	public static int[] eliminateDuplicates(int[] numbers) {
		int[] distinct = new int[numbers.length];
		Arrays.fill(distinct, -1);
		int i = 0;
		int j = 0;
		while (i < numbers.length) {
			int count = 0;
			for (int index = 0; index < distinct.length; index++) {
				if (distinct[index] == numbers[i])
					count++;
			}
			if (count == 0) {
				distinct[j] = numbers[i];
				j++;
			}
			i++;
		}
		return distinct;
	}
}
