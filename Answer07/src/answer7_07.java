import java.util.Arrays;

public class answer7_07 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		Arrays.fill(counts, 0);
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0;
		while (i < 100) {
			int number = (int) (Math.random() * 10);
			for (int index = 0; index < counts.length; index++)
				if (numbers[index] == number)
					counts[index]++;
			i++;
		}
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("There are " + counts[index] + " times " + numbers[index]);
		}
	}
}