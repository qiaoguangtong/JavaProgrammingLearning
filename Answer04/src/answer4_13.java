import java.util.Scanner;

public class answer4_13 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		if (letter>= 'a' && letter<='z'||letter>='A'&&letter<='Z') {
			if(letter == 'a' || letter == 'A' ||letter == 'o' || letter =='O' || letter == 'e'||letter == 'E' || letter =='i' || letter == 'I'||letter == 'U' || letter == 'u')
				System.out.println(letter + " is an vowel");
			else
				System.out.println(letter + " is a consonant");
			
		}else {
			System.out.print(letter + " is an invalid input");
		}
	}
}
