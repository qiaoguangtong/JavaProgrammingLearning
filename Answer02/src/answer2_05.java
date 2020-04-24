import java.util.Scanner;

public class answer2_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double graRate = rate / 100;
		double gratuity = subtotal * graRate;
		double total = subtotal * (1 + graRate);
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}