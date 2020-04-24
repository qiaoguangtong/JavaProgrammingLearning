import java.util.Scanner;

public class answer6_05 {
	/** Sort three numbers */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		displaySortNumbers(number1, number2,number3);
	}

	// Display three numbers in increasing order
	public static void displaySortNumbers(double num1, double num2, double num3) {
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 >num3) {
			double temp = num1;
			num1= num3;
			num3 = temp;
		}
		
		System.out.println("The three numbers in increasing order is " + num1 + ", " + num2 + ", and " + num3);
	
	}
}
