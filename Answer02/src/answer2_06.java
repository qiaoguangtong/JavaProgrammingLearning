import java.util.Scanner;

public class answer2_06 {
	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int random = input.nextInt();
		int hundreds = random / 100;
		int tens = random / 10 % 10;
		int unit = random % 10;
		int sum = hundreds + tens + unit;
		System.out.println("The sum of the digits is " + sum);
	}
}
