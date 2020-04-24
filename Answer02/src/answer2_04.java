import java.util.Scanner;

public class answer2_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double coefficient = 0.454;
		double kilograms = pounds * coefficient;
		System.out.println(pounds + " punds is " + kilograms + " kilograms");
	}
}