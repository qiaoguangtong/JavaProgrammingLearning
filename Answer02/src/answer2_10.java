import java.util.Scanner;

public class answer2_10 {
	public static void main(String[] args) {
		System.out.print("Enter the amount of water in kilograms: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initial = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		double qEnergy = amount * (finalTemp - initial) * 4184;
		System.out.println("The energy needed is " + qEnergy);
	}
}
