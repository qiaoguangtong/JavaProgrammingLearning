import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class LeastFactor {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a integer: ");
		int number = input.nextInt();

		for (int i = 2; i < number + 1; i++) {
			while(number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}
		
		input.close();
	}
}
