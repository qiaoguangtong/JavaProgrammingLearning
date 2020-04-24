package answer.homework;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer9_12 {
	public static void main(String[] args) {
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		input.close();
		LinearEquation linerE = new LinearEquation(a, b, c, d, e, f);
		
		if(linerE.isSolvable()) {
			System.out.printf("The x is %.3f, and the y is %.3f", linerE.getX(), linerE.getY());
		}else {
			System.out.println("This linear equation has no root");
		}
	}
}

class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		if (a * d - b * c != 0) {
			return true;

		} else
			return false;
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}