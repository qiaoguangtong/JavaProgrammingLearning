import java.util.Scanner;

public class answer5_17 {
	/** Display pyramid */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int line = input.nextInt();

		if (line < 1 || line > 15) {
			System.out.println("ERROR: INPUT INVALID.");
			System.exit(0);
		}

		for (int i = 1; i < line + 1; i++) {
			for (int k = 1; k <= line - i; k++) {
				System.out.print("   ");
			}
			for (int j = 1, kk = (2 + 2 * (i - 1)) / 2; j <= (2 + 2 * (i - 1)) / 2 && kk >= 0; j++, kk--) {
				System.out.printf("%3d", kk);
			}
			System.out.print("  ");
			for (int ll = 2; ll <= (2 + 2 * (i - 1)) / 2; ll++)
				System.out.printf("%-3d", ll);
			System.out.println();
		}
	}
}
