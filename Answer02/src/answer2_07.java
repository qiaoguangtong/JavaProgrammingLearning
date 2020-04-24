import java.util.Scanner;

public class answer2_07 {
	public static void main(String[] args) {
		System.out.print("Enter the number of minutes: ");
		Scanner input = new Scanner(System.in);
		long minutes = input.nextLong();
		long alldays = minutes / 60 / 24;
		long years = alldays / 365;
		int days = (int) (alldays % 365);
		System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}
