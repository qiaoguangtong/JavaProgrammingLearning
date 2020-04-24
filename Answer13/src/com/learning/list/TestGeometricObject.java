package com.learning.list;
/**
 * @author Master_Joe
 *
 */
public class TestGeometricObject {
	public static void main(String [] args) {
		GeometricObject circle = new Circle(5);
		GeometricObject rectangle = new Rectangle(5, 3);
		
		System.out.println("The two objects has same area? " + equalArea(circle, rectangle));
		
		// Display circle
		displayObject(circle);
		
		// Display rectangle
		displayObject(rectangle);
	}
	
	/** A method for comparing the areas of two geometric objects */
	public static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
		return obj1.getArea() == obj2.getArea();
	}
	
	/** A method for displaying a geometric object */
	public static void displayObject(GeometricObject obj) {
		System.out.println();
		System.out.println("The area is " + obj.getArea());
		System.out.println("The perimeter is " + obj.getPerimeter());
	}
}
