import java.util.Scanner;

public class answer3_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.print("Enter feet: ");
		double height1 = input.nextDouble();
		System.out.print("Enter height in inches:");
		double height2 = input.nextDouble();
		double height = height1 * 12 + height2;
		final double KIL0GRAMS_PER_P0UND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		double weightInKilograms = weight * KIL0GRAMS_PER_P0UND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}