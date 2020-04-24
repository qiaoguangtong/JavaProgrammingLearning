import java.util.Scanner;

public class answer4_01 {
	public static void main(String[] args) {
		System.out.print("Enter the length from the center to a vertex: ");
		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();
		double s = 2 * length * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		System.out.println("The area of the pentagon is " + (int) (area * 100) / 100.0);
	}
}
