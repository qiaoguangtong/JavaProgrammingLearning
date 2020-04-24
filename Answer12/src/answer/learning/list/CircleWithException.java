package answer.learning.list;

/**
 * @author Master_Joe
 *
 */
public class CircleWithException {
	/** The radius of the circle */
	private double radius;

	/** The number of the objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius is 1.0 */
	public CircleWithException() {
		this(1.0);
	}

	public CircleWithException(double newRadius) throws IllegalArgumentException {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
		numberOfObjects++;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double newRadius) throws IllegalArgumentException {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");

	}

	/** Return number of objects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of a circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
