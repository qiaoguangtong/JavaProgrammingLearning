
public class answer8_04 {
	public static void main(String[] args) {
		int[][] timeOfEmployers = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4 }, { 3, 4, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		// System.out.println(sumOfRow(timeOfEmployers, 0));

		int[][] employers = { { 0, 1, 2, 3, 4, 5, 6, 7 },
				{ sumOfRow(timeOfEmployers, 0), sumOfRow(timeOfEmployers, 1), sumOfRow(timeOfEmployers, 2),
						sumOfRow(timeOfEmployers, 3), sumOfRow(timeOfEmployers, 4), sumOfRow(timeOfEmployers, 5),
						sumOfRow(timeOfEmployers, 6), sumOfRow(timeOfEmployers, 7) } };

		orderHighToLow(employers);
		
		
		for (int i = 0; i < employers[0].length; i++) {
			System.out.println((i + 1) + ": Employer " + employers[0][i] + "\n   Hours: " + employers[1][i]);
			System.out.println();
		}
	}

	/** Return sum of a row */
	public static int sumOfRow(int[][] m, int row) {
		int sum = 0;
		for (int i = 0; i < m[row].length; i++) {
			sum += m[row][i];
		}
		return sum;
	}

	/** Order an array from high to low */
	public static void orderHighToLow(int[][] array) {

		for (int i = 0; i < array[1].length - 1; i++) {
			for (int j = 0; j < array[1].length - i - 1; j++) {
				if (array[1][j] < array[1][j + 1]) {
					int temp = array[1][j];
					array[1][j] = array[1][j + 1];
					array[1][j + 1] = temp;
					temp = array[0][j];
					array[0][j] = array[0][j + 1];
					array[0][j + 1] = temp;

				}
			}
		}
	}
}
