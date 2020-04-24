package answer.homework;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer9_13 {
	public static void main(String[] args) {
		// Create a new Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the column and row
		System.out.print("Enter the number of rows and columns : ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];
		
		System.out.println("Enter the array: ");
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j< array[i].length;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		// Display the result
		System.out.printf("The location of the largest element is %.2f at (%d, %d)", locationLargest(array).maxValue, locationLargest(array).row, locationLargest(array).column);
		input.close();
	}

	/** Return the location of the largest value */
	public static Location locationLargest(double[][] a) {
		Location newLoc = new Location();
		newLoc.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > newLoc.maxValue) {
					newLoc.maxValue = a[i][j];
					newLoc.column = j;
					newLoc.row = i;
				}
			}
		}
		return newLoc;
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue;

}