import java.util.Scanner;

public class answer4_08 {
	public static void main(String[] args) {
		System.out.print("Enter an ASCII code: ");
		Scanner input = new Scanner(System.in);
		int asc = input.nextInt();
		if(asc<0&&asc>127)
			System.out.println("INVALID INPUT");
		char ascch = (char) asc;
		System.out.println("The character for ASCII code " + asc + " is " + ascch);
	}
}
