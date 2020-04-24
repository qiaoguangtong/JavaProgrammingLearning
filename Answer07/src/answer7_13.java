
public class answer7_13 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) % 54 + 1;
		}

		System.out.println("The random number between 1 and 54 is " + getRandom(numbers));
	}

	public static int getRandom(int... numbers) {
		int index = (int) (Math.random() * numbers.length);
		return numbers[index];
	}
}
