package answer.homework;

import java.util.Scanner;

import list.StackOfIntegers;

/**
 * @author Master_Joe
 *
 */

public class Answer10_05 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		if(number <= 0) {
			System.out.println("ERROR: Integer must be greater than 0!!");
			System.exit(0);
		}
		if(number == 1) {
			System.out.print("1's factor is 1 only");
			System.exit(0);
		}
		// Create a StackOfIntegers class
		StackOfIntegers stack = new StackOfIntegers();
		System.out.print("The positive sequence is: ");
		for(int i = 2; i <= number; i++) {
			while(number % i == 0) {
				System.out.print(i + " ");
				stack.push(i);
				number/=i;
			}
		}
		System.out.println();
		System.out.print("The inverted order is: ");
		int stackSize = stack.getSize();
		for(int i = 0; i< stackSize;i++) {
			System.out.print(stack.pop() + " ");
		}
		
		input.close();
		
	}
}