import java.util.Scanner;

public class answer3_18 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight of your goods: ");

		double weight = input.nextDouble();
		if (weight <= 0)
			System.out.println("Weight must > 0");
		else if (weight <=1)
			System.out.println("The price is 3.5");
		else if (weight <=3)
			System.out.println("The price is 5.5");
		else if (weight <= 10)
			System.out.println("The price is 8.5");
		else if (weight <= 20)
			System.out.println("The price is 10.5");
		else 
			System.out.println("The package cannot be shipped!");
	}
}