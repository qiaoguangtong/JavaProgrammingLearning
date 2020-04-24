import java.util.Arrays;
import java.util.Scanner;

public class answer7_21 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of balls to drop: ");
		int dropNumber = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int machineNumber = input.nextInt();
		System.out.println();
		int[] slots = new int[machineNumber];
		Arrays.fill(slots, 0);

		// Find the result for the ways
		for (int i = 0; i < dropNumber; i++) {
			int countR = 0;
			for (int j = 0; j < machineNumber - 1; j++) {
				int a = (int) (Math.random() * 100) % 2;
				if (a == 0) {
					System.out.print("L");
				} else if (a == 1) {
					countR++;
					System.out.print("R");
				}
			}
			slots[countR]++;
			System.out.println();
		}
		System.out.println();

		// Display the images
		int layerCount = getMax(slots);
		while (layerCount > 0) {
			boolean[] decidePrint = new boolean[machineNumber];
			Arrays.fill(decidePrint, false);
			int max = getMax(slots);
			for (int i = 0; i < slots.length; i++) {
				if (max == slots[i]) {
					decidePrint[i] = true;
					slots[i]--;
				}
			}
			layerCount--;
			for (boolean e : decidePrint) {
				if (e) {
					System.out.printf("%-2s", "O");
				} else {
					System.out.printf("%-2s", " ");
				}
			}
			System.out.println();
		}
	}

	/** Return the index for the maximum in an array */
	public static int getMaxIndex(int[] arr) {
		if (arr.length == 0)
			return 0;
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/** Return the max value in an array */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
