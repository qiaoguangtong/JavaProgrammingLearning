import java.util.Scanner;

public class answer2_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		double coefficient = 0.305;
		double meters = feet * coefficient;
		System.out.println(feet + " feet is " + meters + " meters");
	}
}