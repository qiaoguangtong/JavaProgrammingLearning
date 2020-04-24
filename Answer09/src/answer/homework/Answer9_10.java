package answer.homework;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
/** Test the QuadraticEquation */
public class Answer9_10 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to Enter a, b, and c
		System.out.print("Enter a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Create a QuadraticEquation class
		QuadraticEquation newQuaEqua = new QuadraticEquation(a, b, c);
		input.close();
		if(newQuaEqua.getDiscriminant() > 0) {
			System.out.printf("This equation has two roots, and root1 is %.3f, root2 is %.3f\n", newQuaEqua.getRoot1(), newQuaEqua.getRoot2());
		}else if(newQuaEqua.getDiscriminant() == 0){
			System.out.printf("This equation has two same roots, which is %.3f ", newQuaEqua.getRoot1());
		}else {
			System.out.println("This euqation has no real root");
		}

	}
}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	public double getRoot1() {
		if (this.getDiscriminant() >= 0) {
			return (-b + this.getDiscriminant()) / (2 * a);
		} else
			return 0;
	}

	public double getRoot2() {
		if (this.getDiscriminant() >= 0) {
			return (-b - this.getDiscriminant()) / (2 * a);
		} else
			return 0;
	}
}