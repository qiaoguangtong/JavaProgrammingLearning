

import java.util.Scanner;

public class answer8_01 {
	public static void main(String[] args) {
		// Prompt the user to enter a matrix
		System.out.println("Enter a 3-by-4 matrix row by row: ");

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		// Display the result
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
		}
		input.close();
	}

	/** Return the sum of one column in a matrix */
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
