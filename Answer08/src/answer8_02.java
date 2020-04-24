import java.util.Scanner;

public class answer8_02 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] matrix = new double[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				matrix[i][j] = input.nextDouble();
		}
		input.close();
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

	}

	/** Return the sum of a major diagonal */
	public static double sumMajorDiagonal(double[][] m) {
		if (m.length != m[0].length) {
			System.out.println("ERROR: Column count does not equal row count! ");
			System.exit(0);
		}
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}
