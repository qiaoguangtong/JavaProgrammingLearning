import java.util.Scanner;

public class answer3_23 {
	public static void main(String []args) {
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double dx = Math.pow(x*x, 0.5);
		double dy = Math.pow(y*y, 0.5);
		if (dx <= 5&&dy<=2.5)
			System.out.println("Point ("+x+ ", " + y + ") is in the rectangle.");
		else 
			System.out.println("Point ("+x+ ", " + y + ") is not in the rectangle.");
		
		
	}
}
