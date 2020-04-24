import java.util.Scanner;

public class answer4_18 {
	public static void main(String[] args) {
		System.out.print("Enter two characters: ");
		Scanner input = new Scanner(System.in);
		String enter = input.next();
		String major = new String();
		String grade = new String();
		if (enter.charAt(0) == 'M')
			major = "Mathematics";
		else if (enter.charAt(0) == 'C')
			major = "Computer Sience";
		else if (enter.charAt(0) == 'I')
			major = "Information Technology";
		else {
			System.out.println("Invalid input");
			return;
		}
		if (enter.charAt(1) == '1')
			grade = "Freshman";
		else if (enter.charAt(1) == '2')
			grade = "Sophomore";
		else if (enter.charAt(1) == '3')
			grade = "Junior";
		else if (enter.charAt(1) == '4')
			grade = "Senior";
		else {
			System.out.println("Invalid input");
			return;
		}System.out.println(major + " " + grade);
	}
}
