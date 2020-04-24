import java.util.Scanner;

public class answer6_17 {
	/** Show matrix consists of 1 and 0 */
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}

	/** Show a matrix */
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 10) % 2 + " ");
			}
			System.out.println();
		}
	}
}
