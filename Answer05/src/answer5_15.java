
public class answer5_15 {
	/** Display the ASCII character table */
	public static void main(String[] args) {
		for (int i = 33, count = 0; i < 127; i++) {
			System.out.print((char) (i) + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
	}
}
