import java.util.Scanner;

public class answer5_38 {
	/** Decimal to Octal */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		String binaryString = new String();
		int remainder = 0;
		for (int i = number; i>=1;i = (i/8)) {
			remainder = i%8;			
			binaryString = Integer.toString(remainder)+binaryString;
		}
		System.out.println("The octal value for " + number + " is " + binaryString);
	}
}
