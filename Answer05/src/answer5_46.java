import java.util.Scanner;

public class answer5_46 {
	/** Reverse a string */
	public static void main(String []args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a String 
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		System.out.print("The reversed string is ");
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}
