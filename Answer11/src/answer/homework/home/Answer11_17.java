package answer.homework.home;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer11_17 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter some
		System.out.print("Enter an integer m: ");
		int m = scanner.nextInt();
		int integer = m;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= integer; i++) {
			while (integer % i == 0) {
				list.add(i);
				integer /= i;
			}
		}
		int n = 1;
		ArrayList<Integer> factor = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).intValue() == list.get(i).intValue()) {
					count++;
				}
			}
			if (count % 2 == 1) {
				factor.add(list.get(i));
			}
		}
		removeDuplicate(factor);
		for (Integer as : factor) {
			n *= as;
		}
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + m * n);
		scanner.close();
	}

	/** Remove the duplicate element */
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(list.get(j));
					j--;
				}
			}
		}
	}
}
