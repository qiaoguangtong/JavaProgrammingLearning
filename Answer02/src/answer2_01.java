import java.util.Scanner;

public class answer2_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahr;
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		fahr = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahr + " Fahrenheit");

	}
}