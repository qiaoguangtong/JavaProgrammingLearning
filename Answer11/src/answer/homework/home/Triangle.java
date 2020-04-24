package answer.homework.home;

import list.GeometricObject;

/**
 * @author Master_Joe
 *
 */
public class Triangle extends GeometricObject {
	private double side1;
	private double side2; 
	private double side3; 

	public Triangle() {
		this(1, 1, 1);// Default value is 1
	}

	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
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

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + "side3 = " + side3;
	}
}
