import java.util.Scanner;

public class answer4_20 {
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("The length of you enter \"" + str + "\" is " + str.length());
		System.out.println("The first character of you enter \"" + str + "\" is " + str.charAt(0));
	}
}
