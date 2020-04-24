import java.util.Scanner;

public class answer4_26 {
	public static void main(String[] args) {
		System.out.print("Enter the amount: ");
		Scanner input = new Scanner(System.in);
		String amount = input.nextLine();
		String dollar = amount.substring(0, amount.indexOf('.'));
		String cent = amount.substring(amount.indexOf('.') + 1);
		System.out.print("You have " + dollar + " dollars, and " + cent + " cents");
	}
}
