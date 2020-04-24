import java.util.Scanner;

public class answer4_05 {
	public static void main(String []args) {
		System.out.print("Enter the number of sides: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print("Enter the length of every side: ");
		double length = input.nextDouble();
		double area = (number*length*length)/(4*Math.tan(Math.PI/number));
		System.out.println("The area of the polygon is " + area);		
	}
}	
