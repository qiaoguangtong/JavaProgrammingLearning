import java.util.Scanner;

public class answer5_44 {
	/** Computer architecture */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		System.out.print("The bits are ");
		int recordBit = 1;
		for (int i = 15; i >= 0; i--) {
			int temp = integer >> i;
			int bit = temp & recordBit;
			System.out.print(bit);
		}
	}
}
