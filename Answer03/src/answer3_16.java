import java.text.DecimalFormat;

public class answer3_16 {
	public static void main(String[] args) {
		int coefficient = (int) Math.pow(-1, (int) (Math.random() * 10));
		double x = coefficient * 50 * Math.random();
		double y = coefficient * 100 * Math.random();
		System.out.println("A random coordinate of this rectangle is  (" + x + ", " + y + ")");
	}
}
