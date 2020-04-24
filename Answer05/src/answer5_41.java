import java.util.Scanner;

public class answer5_41 {
	/** Occurrence of max numbers */
	public static void main(String[] args) {
		System.out.print("Enter some integers: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("No number entered except 0!");
			System.exit(0);
		}

		int count = 0;
		int max = 0;
		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				count = 1;
				max = number;
			} else if (number == max) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence of the largest number is " + count);
	}
}
