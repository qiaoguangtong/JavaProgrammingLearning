import java.util.Scanner;

public class answer4_09 {
	public static void main(String[] args) {
		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		char c = input.nextLine().charAt(0);
		int integer = (int) c;
		System.out.println("The Unicode for the character " + c + " is " + integer);
	}
}
