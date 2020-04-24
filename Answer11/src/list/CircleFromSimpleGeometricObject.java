package list;

public class CircleFromSimpleGeometricObject extends GeometricObject {
	private double radius;
	public CircleFromSimpleGeometricObject() {
		
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Return area */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2* Math.PI * radius;
	}
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
	
}