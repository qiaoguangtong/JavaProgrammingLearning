
public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {

	}

	Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4.0, 40.0);
		Rectangle rect2 = new Rectangle(3.5, 35.9);

		System.out.println("Rectangle1's area is " + rect1.getArea());
		System.out.println("Rectangle1's area is " + rect1.getPerimeter());
		System.out.println("Rectangle2's area is " + rect2.getArea());
		System.out.println("Rectangle2's area is " + rect1.getPerimeter());
	}
}