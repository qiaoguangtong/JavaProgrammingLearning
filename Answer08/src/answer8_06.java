import java.util.Scanner;

public class answer8_06 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] results = new double[3][3];
		// Prompt the user to enter ...
		System.out.print("Enter matrix1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j< matrix1[i].length; i++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for (int i = 0; i < matrix2.length; i++) {
			for(int j = 0; j< matrix2[i].length; i++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		
	}
}
