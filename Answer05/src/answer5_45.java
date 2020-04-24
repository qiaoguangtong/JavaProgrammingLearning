import java.util.Scanner;

public class answer5_45 {
	/** Statistics: compute mean and standard deviation */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double sum = 0;
		double square = 0;
		for (int i = 0; i < 10; i++) {
			double number = input.nextDouble();
			sum += number;
			square += Math.pow(number, 2);
		}
		double mean = sum / 10.0;

		double formular = (square - sum * sum / 10.0) / (10 - 1);
		double deviation = Math.pow(formular, 0.5);

		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.6f ", deviation);
	}
}
