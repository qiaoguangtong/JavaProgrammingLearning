import java.util.Arrays;
import java.util.Scanner;

public class answer7_05 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];

		Arrays.fill(numbers, -1);
		int j = 0;
		int i = 0;
		while (i < 10) {
			int number = input.nextInt();
			int count = 0;
			for (int index = 0; index < numbers.length; index++) {
				if (number == numbers[index])
					count++;
			}
			if (count == 0) {
				numbers[j] = number;
				j++;
			}
			i++;
		}

		int index;
		for (index = 0; index < numbers.length; index++) {
			if (numbers[index] == -1) {
				break;
			}
		}

		System.out.println("The number of distinct number is " + index);
		System.out.print("The distinct numbers are: ");
		for (int e : numbers) {
			if (e == -1) {
				break;
			}
			System.out.print(e + " ");
		}

	}
}