package answer.homework.practice;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_03 {
	public static void main(String [] args) {
		int[] list = new int[100];
		// Create a Scanner 
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 1000);
		}
		
		try {
			while(true) {
				// Prompt the user to enter the index
				System.out.print("Enter an index for the list: ");
				int index = scanner.nextInt();
				System.out.println("The value is " + list[index]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}
}
