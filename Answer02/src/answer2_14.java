import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_14 {
	public static void main(String[] args) {
		System.out.print("Enter weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		double kg = pounds * 0.45359237;
		double meter = inches * 0.0254;
		double BMI = kg / meter / meter;
		DecimalFormat bmi = new DecimalFormat("#.0000");
		System.out.print("BMI is " + bmi.format(BMI));
	}
}
