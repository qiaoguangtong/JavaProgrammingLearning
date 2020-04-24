import java.util.Scanner;

public class answer4_14 {
	public static void main(String [] args) {
		System.out.print("Enter a letter grade: ");
		Scanner input = new Scanner(System.in);
		char letter = input.nextLine().charAt(0);
		if (letter == 'A'||letter =='a')
			System.out.println("The numeric value for " + letter + " is 4");
		else if (letter == 'b'|| letter =='B')
			System.out.println("The numeric value for " + letter + " is 3");
		else if (letter == 'c' || letter == 'C')
			System.out.println("The numeric value for " + letter + " is 2");
		else if(letter == 'd' || letter =='D')
			System.out.println("The numeric value for " + letter + " is 1");
		else if (letter == 'f'||letter == 'F')
			System.out.println("The numeric value for " + letter + " is 0");
		else 
			System.out.println(letter + " is an invalid input");
	}
}
