import java.util.Scanner;

public class answer3_22 {
	public static void main(String []args ) {
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = Math.pow(Math.pow(x, 2)+Math.pow(y, 2), 0.5);
		if(distance <= 10)
			System.out.println("Point (" + x + ", "+ y + ") is in the circle.");
		else 
			System.out.println("Point (" + x + ", "+ y + ") is not in the circle.");
	}
}
