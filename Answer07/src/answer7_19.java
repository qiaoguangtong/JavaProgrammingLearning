import java.util.Scanner;

public class answer7_19 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list: ");
		int length = input.nextInt();
		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		if (isSorted(numbers)) {
			System.out.println("The list is already sorted!!");
		} else {
			System.out.println("The list is not sorted!!");
		}
	}

	/** Decide if the list is sorted */
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] < list[i + 1] || list[i] == list[i + 1]) {
				continue;
			} else if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
