package answer.homework.home;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class TestPolygon {
	public static void main(String[] args) {
		Polygon polygon = new Polygon();
		int pointNum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the points: ");
		pointNum = in.nextInt();
		System.out.println("Enter the coordinates of the points: ");
		for (int i = 0; i < pointNum; i++) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			MyPoint p1 = new MyPoint(x, y);
			polygon.setPoint(p1);
		}
		System.out.println("The total area is " + polygon.Area(pointNum));
		in.close();
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

class Polygon {
	// ArrayList Save the Points
	private ArrayList<MyPoint> array = new ArrayList<>();

	public Polygon() {
	}

	public void setPoint(MyPoint p) {
		this.array.add(p);
	}

	// 计算凸多边形的思路：从一个定点开始和它不相邻的顶点连线，这样就可以把凸多边形划分成几个三角形
	// 用第十章课后题中的计算三角形面积公式求出面积即可
	// 三角形面积之和等于凸多边形的面积
	public double Area(int pointNum) {
		int i = 0;
		double temp = 0;
		for (; i < pointNum - 1; i++) {
			temp += (this.array.get(i).getX() - this.array.get(i + 1).getX())
					* (this.array.get(i).getY() + this.array.get(i + 1).getY());
		}
		// Make sure the list.length
		temp += (this.array.get(i).getX() - this.array.get(0).getX())
				* (this.array.get(i).getY() + this.array.get(0).getY());
		if (temp < 0)
			temp = -temp;
		return temp / 2;
	}
}
