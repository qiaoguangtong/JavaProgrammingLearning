
public class answer4_06 {
	public static void main(String[] args) {
		double radius = 40.0;
		double x1 = radius * Math.cos(Math.toRadians(Math.random() * 180.0));
		double y1 = radius * Math.sin(Math.toRadians(Math.random() * 180.0));
		double x2 = radius * Math.cos(Math.toRadians(Math.random() * 180.0));
		double y2 = radius * Math.sin(Math.toRadians(Math.random() * 180.0));
		double x3 = radius * Math.cos(Math.toRadians(Math.random() * 180.0));
		double y3 = radius * Math.sin(Math.toRadians(Math.random() * 180.0));
		double d1 = distance(x1, y1, x2, y2);
		double d2 = distance(x1, y1, x3, y3);
		double d3 = distance(x2, y2, x3, y3);
		// System.out.println(d1);
		double cos1 = -(d1 * d1 - d2 * d2 - d3 * d3) / (2 * d2 * d3);
		double cos2 = -(d2 * d2 - d1 * d1 - d3 * d3) / (2 * d1 * d3);
		double cos3 = -(d3 * d3 - d1 * d1 - d2 * d2) / (2 * d1 * d2);
		double angle1 = Math.toDegrees(Math.acos(cos1));
		double angle2 = Math.toDegrees(Math.acos(cos2));
		double angle3 = Math.toDegrees(Math.acos(cos3));
		// System.out.println("The three random angles are " + angle1 + ", " + angle2 +
		// ", and " + angle3 + ".");
		System.out.printf("The three random angles is %.2f, %.2f, and %.2f.", angle1, angle2, angle3);

	}

	static double distance(double x1, double y1, double x2, double y2) {
		return Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
	}
}
