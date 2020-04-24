import java.util.Scanner;

public class answer4_15 {
	public static void main(String [] args) {
		System.out.print("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		char letter = input.nextLine().charAt(0);
		if((letter<= 'Z'&&letter>='A')||(letter <= 'z' && letter >='a')) {
			if(letter<='c'&&letter>='a' || letter <='C' && letter >= 'A')
				System.out.println("The corresponding number is 2");
			if(letter<='f'&&letter>='d' || letter <='F' && letter >= 'D')
				System.out.println("The corresponding number is 3");
			if(letter<='i'&&letter>='g' || letter <='I' && letter >= 'G')
				System.out.println("The corresponding number is 4");
			if(letter<='l'&&letter>='j' || letter <='L' && letter >= 'J')
				System.out.println("The corresponding number is 5");
			if(letter<='o'&&letter>='n' || letter <='O' && letter >= 'M')
				System.out.println("The corresponding number is 6");
			if(letter<='s'&&letter>='p' || letter <='S' && letter >= 'P')
				System.out.println("The corresponding number is 7");
			if(letter<='v'&&letter>='t' || letter <='V' && letter >= 'T')
				System.out.println("The corresponding number is 8");
			if(letter<='z'&&letter>='w' || letter <='Z' && letter >= 'W')
				System.out.println("The corresponding number is 9");
		}else
			System.out.println(letter + " is an invalid input");
	}
}
