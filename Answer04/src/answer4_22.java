import java.util.Scanner;

public class answer4_22 {
	public static void main(String []args) {
		System.out.print("Enter string s1: ");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();
		if(s1.contains(s2))
			System.out.println(s2 + " is a substring of "+ s1);
		else
			System.out.println(s2 + " is not a substring of "+ s1);
			
	}
}
