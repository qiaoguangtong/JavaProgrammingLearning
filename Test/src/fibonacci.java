import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int a, b = 1, c = 1;

		System.out.print("Enter a number: ");
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 3; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
		}

		System.out.println(c);
	}
}
