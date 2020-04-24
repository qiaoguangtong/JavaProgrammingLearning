package answer.homework.home;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer11_16 {
	/** RepeatAdditionQuiz */
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		ArrayList<Integer> list = new ArrayList<>();
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();
		list.add(answer);
		
		while (number1 + number2 != answer) {
			System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
			answer = input.nextInt();
			list.add(answer);
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).intValue()== answer) {
					System.out.println("You've already entered " + answer);
				}
			}
		}
		System.out.println("You got it!");
		input.close();
	}
}
