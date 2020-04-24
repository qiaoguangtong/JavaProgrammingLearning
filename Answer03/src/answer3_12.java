import java.util.Scanner;

public class answer3_12 {
	public static void main(String[]args) {
		System.out.print("Enter a three-digit integer: ");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		int d1 = integer/100;
		int d3 = integer%10;
		if(d1 == d3)
			System.out.println(integer + " is a palindrome.");
		else
			System.out.println(integer + " is not a palindrome.");
	}
}
