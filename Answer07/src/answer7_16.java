import java.util.Arrays;

public class answer7_16 {
	/** The executing time */
	public static void main(String[] args) {
		
		int[] numbers = new int[1000000];
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = (int) (Math.random() * 100000);
		}
		int key = numbers[(int) (Math.random() * numbers.length)];

		long startTime = System.currentTimeMillis();
		System.out.println("The index of the key " + key + " is " + linearSearch(numbers, key));
		long endTime = System.currentTimeMillis();

		long executionTime1 = endTime - startTime;
		System.out.println("The time for the linear search is " + executionTime1);

		long startTime2 = System.currentTimeMillis();
		Arrays.sort(numbers);
		System.out.println("The index of the key " + key + " is " + binarySearch(numbers, key));

		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		System.out.println("The time for the linear search is " + executionTime2);
	}

	/** The method for finding key in the list */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}

	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else
				low = mid + 1;
		}

		return -low - 1;
	}
}
