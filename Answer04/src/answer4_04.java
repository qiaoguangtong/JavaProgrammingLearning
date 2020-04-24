import java.util.Scanner;

public class answer4_04 {
	public static void main(String[] args) {
		System.out.print("Enter the side: ");
		Scanner input = new Scanner(System.in);
		double side = input.nextDouble();
		double area = 6 * side * side / (4 * Math.tan(Math.PI / 6));
		System.out.println("The area of the hexagon is " + ((int) (area * 100)) / 100.0);
	}
}
