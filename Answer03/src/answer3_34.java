import java.util.Scanner;

public class answer3_34 {
	public static void main(String[] args) {
		System.out.print("Enter three points for p0, p1 and p2: ");
		Scanner input = new Scanner(System.in);
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double parameter = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (parameter == 0 && x2 <= Math.max(x0, x1) && x2 >= Math.min(x0, x1) && y2 <= Math.max(y0, y1)
				&& y2 >= Math.min(y0, y1))
			System.out.println("(" + x2 + ", " + y2 + ") is on the segment line from (" + x0 + ", " + y0 + ") to (" + x1
					+ ", " + y1 + ")");
		else
			System.out.println("(" + x2 + ", " + y2 + ") is not on the segment line from (" + x0 + ", " + y0 + ") to ("
					+ x1 + ", " + y1 + ")");
	}
}
