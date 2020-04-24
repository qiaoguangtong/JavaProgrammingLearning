import java.util.Scanner;

public class TEST328 {
	/** Decide the position */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y- coordinates, width and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		if (Math.abs(x1 - x2) > (width1 + width2) && Math.abs(y2 - y1) > (height1 + height2)
				&& Math.abs(x1 - x2) > (height1 + height2) && Math.abs(y2 - y1) > (width1 + width2))
			System.out.println("r2 does not overlap r1");
		else if (Math.abs(x1 - x2) < Math.abs(width2 - width1) && Math.abs(y2 - y1) < Math.abs(height1 - height2)
				&& Math.abs(x1 - x2) < Math.abs(height1 - height2) && Math.abs(y2 - y1) < Math.abs(width2 - width1))
			System.out.println("r2 is inside r1");
		else
			System.out.println("r2 overlaps r1");
	}
}
