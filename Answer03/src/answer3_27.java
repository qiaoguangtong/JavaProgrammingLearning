import java.util.Scanner;

public class answer3_27 {
	public static void main(String[] args) {
		System.out.print("Enter a point's x- and y-coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if (x >= 0 && y >= 0 && y <= (-1 * x / 2 + 100))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}
