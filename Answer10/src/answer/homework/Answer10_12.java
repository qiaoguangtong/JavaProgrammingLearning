package answer.homework;

/**
 * @author Master_Joe
 *
 */
public class Answer10_12 {
	/** Main method, in other word, this is testTriangle2D */
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("The area of the triangle t1 " + t1.toString() + " is " + t1.getArea()
				+ ", and its perimeter is " + t1.getPerimeter());
		System.out.println("t1.contains(3, 3) is " + t1.contains(new MyPoint(3, 3)));
		System.out.println("t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))) is "
				+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out
				.println("t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))) is "
						+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
//		System.out
//				.println("t1.overlaps(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4)))) is "
//						+ t1.overlaps(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
	}
}

class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D() {
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(double x, double y) {
		p1 = new MyPoint(x, y);
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(double x, double y) {
		p2 = new MyPoint(x, y);
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(double x, double y) {
		p3 = new MyPoint(x, y);
	}

	public double getPerimeter() {
		return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
	}

	public double getArea() {
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p2.distance(p3);
		double p = this.getPerimeter() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//		return Math.sqrt(this.getPerimeter() / 2 * (this.getPerimeter() / 2 - p1.distance(p2))
//				* (this.getPerimeter() / 2 - p1.distance(p3)) * (this.getPerimeter() / 2 - p2.distance(p3)));
	}

	/** If p is in this triangle, return true; */
	public boolean contains(MyPoint p) {
		// The first edge
		boolean bool1 = sameSide(p1, p2, p, p3);
		boolean bool2 = sameSide(p1, p3, p, p2);
		boolean bool3 = sameSide(p2, p3, p, p1);

		if (bool1 && bool2 && bool3)
			return true;
		else
			return false;

	}

	/** If t contains this triangle or this on the contrary, return true */
	public boolean contains(Triangle2D t) {
		// thisTriangle contains t
		boolean b1 = contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
		boolean b2 = t.contains(p1) && t.contains(p2) && t.contains(p3);
		return b1 ^ b2;

		/**
		 * if(b1 && b2) { // If t contains this triangle and this triangle contains t,
		 * the two triangles are same } but maybe it is not right
		 */
	}

	/**
	 * If this triangle overlaps t, return true Solution: any line has intersections
	 * with the other triangle, then the two triangle overlap
	 */
	public boolean overlaps(Triangle2D t) {
		// p1_p2 of triangle t and 3 edges in this
		boolean b1 = lineIntersection(p1, p2, t.getP1(), t.getP2());
		boolean b2 = lineIntersection(p2, p3, t.getP1(), t.getP2());
		boolean b3 = lineIntersection(p1, p3, t.getP1(), t.getP2());
		// p1_p3 of triangle t and 3 edges in this
		boolean b4 = lineIntersection(p1, p2, t.getP1(), t.getP3());
		boolean b5 = lineIntersection(p2, p3, t.getP1(), t.getP3());
		boolean b6 = lineIntersection(p1, p3, t.getP1(), t.getP3());
		// p2_p3 of triangle t and 3 edges in this
		boolean b7 = lineIntersection(p1, p2, t.getP2(), t.getP3());
		boolean b8 = lineIntersection(p2, p3, t.getP2(), t.getP3());
		boolean b9 = lineIntersection(p1, p3, t.getP2(), t.getP3());
		// return b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8 || b9;
		return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9;
	}

	/** If p and p3 is on the same side, return true */
	public boolean sameSide(MyPoint p1, MyPoint p2, MyPoint p, MyPoint p3) {
		// Save the the product of the two vector product
		double a = vectorProduct(p1, p2, p3) * vectorProduct(p1, p2, p);
		if (a > 0)
			return true;
		else
			return false;
	}

	/** Return the vector product for p->p2 and p2->p1 */
	public double vectorProduct(MyPoint p1, MyPoint p2, MyPoint p) {
		double x1 = p2.getX() - p.getX();
		double y1 = p2.getX() - p.getX();
		double Xab = p1.getX() - p2.getX();
		double Yab = p1.getX() - p2.getY();
		double vectorProduct = Xab * y1 - x1 * Yab;
		// double vectorProduct = x1 * Xab + y1 * Yab;
		return vectorProduct;
	}

	/** If two line intersect with each other, return true */
	public boolean lineIntersection(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
		double a = p1.getY() - p2.getY();
		double b = p2.getX() - p1.getX();
		double c = p3.getY() - p4.getY();
		double d = p4.getX() - p3.getX();
		double denominator = a * d - b * c;
		if (denominator != 0) {
			return true;
		} else {
			return false;
		}
	}

	/** Decide if a point p is on the line p1->p2 */
	public boolean onSegment(MyPoint p1, MyPoint p2, MyPoint p) {
		double parameter = (p2.getX() - p1.getX()) * (p.getY() - p1.getY())
				- (p.getX() - p1.getX()) * (p2.getY() - p1.getY());
		if (parameter == 0 && p.getX() <= Math.max(p1.getX(), p2.getX()) && p.getX() >= Math.min(p1.getX(), p2.getX())
				&& p.getY() <= Math.max(p1.getY(), p2.getY()) && p.getY() >= Math.min(p1.getY(), p2.getY()))
			return true;
		else
			return false;
	}

	/** Return the point intersection */
	public MyPoint getIntersection(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
		MyPoint point;
		double a = p1.getY() - p2.getY();
		double b = p2.getX() - p1.getX();
		double c = p3.getY() - p4.getY();
		double d = p4.getX() - p3.getX();
		double e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p2.getX()) * p1.getY();
		double f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();
		double denominator = a * d - b * c;
		if (denominator != 0) {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			point = new MyPoint(x, y);
		} else {
			point = new MyPoint(-999, -999); // If there is no intersection, return point (-999, -999)
		}
		return point;
	}

	@Override
	public String toString() {
		return "[" + p1.toString() + "," + p2.toString() + ", " + p3.toString() + "]";
	}
}