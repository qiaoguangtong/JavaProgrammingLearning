import java.util.Scanner;

public class answer6_35 {
	public static void main(String []args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a side
		System.out.print("Enter a side: ");
		double side = input.nextDouble();
		
		// Display the result
		System.out.println("The area of the pentagon is " + area(side));
	}
	
	/** Return the area of a pentagon*/
	public static double area(double side) {
		double area = (5*side*side)/(4*Math.tan(Math.PI/5));		
		return area;
	}
}	
