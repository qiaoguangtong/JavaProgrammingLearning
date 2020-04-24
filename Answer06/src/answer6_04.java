import java.util.Scanner;

public class answer6_04 {
	/** Display an integer reversed */
	public static void main(String []args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.println("The reversal of " + integer + " is "  + reverse(integer));
	}
	
	// Return the reversal of a number
	public static int reverse(int integer) {
		String str0 = Integer.toString(integer);
		String str1 = "";
		for (int index = 0; index < str0.length(); index ++ ) {
			str1 = Character.toString(str0.charAt(index)) + str1;
		}
		return Integer.parseInt(str1);
	}
}
