package list;

public class SimpleCircle {
	/** Main method */
	public static void main(String[] args) {
		// Create a circle with radius 1;
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle with radius " + circle1.radius + " is " + circle1.getArea());

		// Create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle with radius " + circle2.radius + " is " + circle2.getArea());

		// Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle with radius " + circle3.radius + " is " + circle3.getArea());

		// Modify circle radius
		circle2.setRadius(100);
		System.out.println("The area of the circle with radius " + circle2.radius + " is " + circle2.getArea());
	}
// Define the circle class with two constructors

	double radius;

	/** Construct a circle with radius equals 1 */
	SimpleCircle() {
		radius = 1;
	}

	/** Construct a circle with specified */
	SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	/** Return the area of a circle */
	double getArea() {
		return Math.PI * radius * radius;
	}

	/** Return the perimeter of circle */
	double getPermeter() {
		return 2 * Math.PI * radius;
	}

	/** Set a new circle for this circle */
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
