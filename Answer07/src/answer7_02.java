import java.util.*;

public class answer7_02 {
	public static void main(String[] args) {
		System.out.print("Enter 10 numbers: ");
		Scanner input = new Scanner(System.in);
		int n = 10;
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("The reversal is: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}
}
