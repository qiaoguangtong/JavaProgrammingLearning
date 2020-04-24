package answer.learning.list;

/**
 * @author Master_Joe
 *
 */
public class TestCircleWithException {
	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-9);
			CircleWithException c3 = new CircleWithException(0);
			System.out.println(c1.toString() + c2 + c3);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("The number of the objects created is " + CircleWithException.getNumberOfObjects());
	}
}
