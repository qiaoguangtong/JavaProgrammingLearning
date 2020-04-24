package answer.homework.practice;

import list.GeometricObject;

/**
 * @author Master_Joe
 *
 */

public class Answer12_05 {
	public static void main(String[] args) {
		try {
			new Triangle(3, 4, 5);
			new Triangle(1, 2, 3);
			new Triangle(1, 1, 4);
		} catch (IllegalTriangleException e) {
			System.out.println(e.getMessage());
			System.out.println("Number of objects created: " + Triangle.getNumberOfObjects());
		}
	}
}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	private static int numberOfObjects = 0;

	public Triangle() throws IllegalTriangleException {
		this(1, 1, 1);// Default value is 1
		numberOfObjects++;
	}

	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
		if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
			this.side1 = s1;
			this.side2 = s2;
			this.side3 = s3;
		} else {
			throw new IllegalTriangleException(s1, s2, s3);
		}
		numberOfObjects++;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + "side3 = " + side3;
	}
}

class IllegalTriangleException extends Exception {

	private double s1;
	private double s2;
	private double s3;

	public IllegalTriangleException() {

	}

	public IllegalTriangleException(double s1, double s2, double s3) {
		super("Invalid side length: " + s1 + ", " + s2 + " and " + s3);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double getS1() {
		return s1;
	}

	public double getS2() {
		return s2;
	}

	public double getS3() {
		return s3;
	}

}
