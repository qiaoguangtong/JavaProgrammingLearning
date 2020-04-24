package Result;

import java.util.Scanner;

public class answer815 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];
		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();

		if (sameLine(points)) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}
	}

	public static boolean sameLine(double[][] points) {
		for (int i = 2; i < points.length; i++) {
			if (!onTheSameLine(points[0][0], points[0][1], points[1][0], points[1][1], points[i][0],
					points[i][1])) {
				return false;
			}
		}

		return true;
	}
	
	/**
	 * Return true if the point (x2, y2) is on the same line from (x0, y0) to (x1,
	 * y1)
	 */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double parameter = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (parameter == 0)
			return true;
		return false;
	}
}
