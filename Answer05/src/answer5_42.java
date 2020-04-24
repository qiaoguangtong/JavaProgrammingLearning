import java.util.Scanner;

public class answer5_42 {
	/** Financial application: find the sales amount */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your commision sought: ");
		double commision = input.nextDouble();
		double baseSalary = 5000;
		double push = 0;
		double push0 = 0;
		for (push0 = 0; push0 <= commision - baseSalary; push += 0.01) {
			if (push <= 5000) {
				push0 = push * 0.08;
			} else if (push > 5000 && push <= 10000) {
				push0 = 5000 * 0.08 + (push - 5000) * 0.10;
			} else {
				push0 = 5000 * 0.08 + (10000 - 5000) * 0.10 + (push - 10000) * 0.12;
			}
		}
		System.out.printf("If you wanna earn $%.3f a year, your minimum sales should be $%.3f", commision, push);
	}
}