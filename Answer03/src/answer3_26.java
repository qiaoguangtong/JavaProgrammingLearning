import java.util.Scanner;

public class answer3_26 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 5 == 0 && number % 6 == 0)
			System.out.println("Is " + number + " divided by 5 and 6? True");
		else
			System.out.println("Is " + number + " divided by 5 and 6? False");
		if (number %5==0||number%6==0)
			System.out.println("Is "+number+" divided by 5 or 6? True");
		else 
			System.out.println("Is "+number+" divided by 5 or 6? False");
		if (number %5==0^number%6==0)
			System.out.println("Is "+number + " divided by 5 or 6, but not both? True");
		else 
			System.out.println("Is "+number + " divided by 5 or 6, but not both? False");
		
	}
}
