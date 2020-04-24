import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_23 {
	public static void main(String []args) {
		System.out.print("Enter the driving distance(miles): ");
		Scanner input = new Scanner(System.in);
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();
		System.out.print("Enter price per gallon(dollar): ");
		double price = input.nextDouble();
		double cost = distance/miles*price;
		DecimalFormat f = new DecimalFormat("#.00");
		System.out.println("The cost of driving is $" + f.format(cost));
	}
}
