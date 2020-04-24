package answer.homework;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
/** Test MyPoint */
public class Answer10_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Create two points
		MyPoint point1 = new MyPoint(0, 0);
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println("The distance of the two points" + point1.toString() + " and " + point2.toString() + " is "
				+ point1.distance(point2));

		// Using the directed point
		System.out.println("The distance of the two points" + point1.toString() + " and " + point2.toString() + " is "
				+ point1.distance(point2.getX(), point2.getY()));
		input.close();
	}
}

class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(MyPoint newPoint) {
		return Math.pow((this.x - newPoint.getX()) * (this.x - newPoint.getX())
				+ (this.y - newPoint.getY()) * (this.y - newPoint.getY()), 0.5);
	}

	public double distance(double x, double y) {
		return Math.pow((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y), 0.5);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";

	}
}
