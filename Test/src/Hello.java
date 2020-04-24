import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(number);
		input.close();
	}
}
