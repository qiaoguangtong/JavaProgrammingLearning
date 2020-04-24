
public class answer6_30 {
	public static void main(String[] args) {
		
			int a1 = (int) (Math.random() * 100) % 6 + 1;
			int b1 = (int) (Math.random() * 100) % 6 + 1;
			check(a1, b1);
			int a2 = (int) (Math.random() * 100) % 6 + 1;
			int b2 = (int) (Math.random() * 100) % 6 + 1;;
			check(a2,b2,a1+b1);
	}

	/** Decide if you are lost */
	public static void check(int a, int b) {
		int c = a + b;
		if (c == 2 || c == 3 || c == 12) {
			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
			System.out.println("You win");
			System.exit(0);
		} else if (c == 7 || c == 11) {
			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
			System.out.println("You lose");
			System.exit(0);
		} else {
			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
			System.out.println("point is " + (a + b));
		}
	}

	public static void check(int a, int b, int c) {
		if (a + b == 7) {
			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
			System.out.println("You lose");
		} else if (a + b == c) {
			System.out.println("You rolled " + a + " + " + b + " = " + c);
			System.out.println("You win");
		} else {
			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
			System.out.println("You lose");
		}
	}
}