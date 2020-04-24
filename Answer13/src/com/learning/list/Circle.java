package com.learning.list;
/**
 * @author Master_Joe
 *
 */
public class Circle extends GeometricObject{
	private double radius;
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
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
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius;
	}
}
