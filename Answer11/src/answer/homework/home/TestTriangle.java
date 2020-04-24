package answer.homework.home;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class TestTriangle {
	public static void main(String[] args) {
		// Create a Scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the three sides and color, and filled properties
		System.out.print("Enter the three sides(double) color(String) and if it is filled of a new triangle: ");
		
		
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3= scanner.nextDouble();
		String color = scanner.next();
		String bool = scanner.next();
		
		boolean isF;
		if(bool.equals("true") || bool.equals("TRUE")) {
			isF = true;
		}else{
			isF = false;
		}
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(isF);
		System.out.println("The area of this triangle is " + triangle.getArea());
		System.out.println("The perimeter of this triangle is " + triangle.getPerimeter());
		System.out.println("The color of this triangle is " + triangle.getColor().toLowerCase());
		System.out.println("The filled status is " + triangle.isFilled());
		
		scanner.close();
	}
}
