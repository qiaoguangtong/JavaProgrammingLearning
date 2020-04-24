
public class answer6_01 {
	/** Math: pentagonal numbers */
	public static void main(String[] args) {
		for (int index = 0; index < 100; index++) {
			System.out.print(getPentagonalNumber(index) + "\t");
			if ((index + 1) % 10 == 0)
				System.out.println();
		}
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
