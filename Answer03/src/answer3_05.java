import java.util.Scanner;

public class answer3_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		String toDay = new String();
		switch (today) {
		case 1:
			toDay = "Monday";
			break;
		case 2:
			toDay = "TuesDay";
			break;
		case 3:
			toDay = "Wednesday";
			break;
		case 4:
			toDay = "Thursday";
			break;
		case 5:
			toDay = "Friday";
			break;
		case 6:
			toDay = "Saturday";
			break;
		case 0:
			toDay = "Sunday";
			break;
		}
		System.out.print("Enter the number of days elapsed since today: ");
		int gap = input.nextInt();
		int nextDay = today + gap;
		while (nextDay > 7)
			nextDay -= 7;
		String curDay = new String();
		switch (nextDay) {
		case 1:
			curDay = "Monday";
			break;
		case 2:
			curDay = "TuesDay";
			break;
		case 3:
			curDay = "Wednesday";
			break;
		case 4:
			curDay = "Thursday";
			break;
		case 5:
			curDay = "Friday";
			break;
		case 6:
			curDay = "Saturday";
			break;
		case 0:
			curDay = "Sunday";
			break;
		}
		System.out.println("Today is " + toDay + " and the future day is " + curDay);
	}
}