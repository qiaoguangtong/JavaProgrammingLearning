package answer.learning.test;

import answer.learning.list.CircleWithException;

/**
 * @author Master_Joe
 *
 */
public class TestFinally {
	public static void main(String[] args) {
		System.out.println("The function start: ");
		double a = returnIt();
		System.out.println(a);
	}

	/** Test Finally */
	public static double returnIt() {
		double a = 0;
		try {
			System.out.println("Hello, world");
			CircleWithException c1 = new CircleWithException(-9);
			System.out.println(c1);
			System.out.println("Hello, world");
			return a;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			a = 3;
			return a;
		} finally {
			System.out.println("Final has been called");
		}
	}
}
