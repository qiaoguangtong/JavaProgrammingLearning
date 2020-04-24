package List;

public class list6_04 {
	/** Increment */
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the call, the x is " + x);
		increment(x);
		System.out.println("After the call, the x is " + x);
	}

	public static void increment(int n) {
		n++;
		System.out.println("n is inside the method is " + n);
	}
}
