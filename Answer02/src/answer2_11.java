import java.util.Scanner;

public class answer2_11 {

	public static void main(String[] args) {
		double current = 312032486;
		double everyYSecond = 365 * 24 * 60 * 60;
		double increase = everyYSecond / 7;
		double decrease = everyYSecond / 13;
		double immigrantion = everyYSecond / 45;
		System.out.print("Enter the number of years: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double Increase = increase + immigrantion - decrease;
		current += n * Increase;
		System.out.println("The population in " + n + " years is " + (long) current);
	}
}
