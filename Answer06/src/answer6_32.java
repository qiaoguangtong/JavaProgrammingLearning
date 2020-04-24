
public class answer6_32 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 0; i < 10000; i++) {
			int a1 = (int) (Math.random() * 100) % 6 + 1;
			int b1 = (int) (Math.random() * 100) % 6 + 1;
			if (check(a1, b1)) {
				count++;
				continue;
			}
			int a2 = (int) (Math.random() * 100) % 6 + 1;
			int b2 = (int) (Math.random() * 100) % 6 + 1;
			;
			if (check(a2, b2, a1 + b1)) {
				count++;
			}
		}
		System.out.println("The number of what you win is " + count);

	}

	/** Decide if you are lost */
	public static boolean check(int a, int b) {
		int c = a + b;
		if (c == 2 || c == 3 || c == 12) {
//			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
//			System.out.println("You win");
			return true;
		} else if (c == 7 || c == 11) {
//			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
//			System.out.println("You lose");
			return false;
		} else {
//			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
//			System.out.println("point is " + (a + b));
			return false;
		}
	}

	public static boolean check(int a, int b, int c) {
		if (a + b == 7) {
//			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
//			System.out.println("You lose");
			return false;
		} else if (a + b == c) {
//			System.out.println("You rolled " + a + " + " + b + " = " + c);
//			System.out.println("You win");
			return true;
		} else {
//			System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
//			System.out.println("You lose");
			return false;
		}
	}
}
