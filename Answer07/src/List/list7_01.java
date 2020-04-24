package List;

import java.util.Scanner;

public class list7_01 {
	/** AnalyzeNumbers */
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double []numbers = new double [n];
		double sum = 0;
		
		System.out.print("Enter the numbers: ");
		for(int index = 0; index < n; index ++ ) {
			numbers[index] = input.nextDouble();
			sum += numbers[index];
		}
		
		double average = sum /n;
		
		int count = 0; // The number of elements above average;
		
		for(int i  = 0;i<n;i++) {
			if(numbers[i] > average) {
				count ++;
			}
		}
		System.out.println("The average is " +  average);
		System.out.println("The number of the elements above average is " + count);
		
	}
}
