import java.util.Scanner;

public class answer4_17 {
	public static void main(String[] args) {
		System.out.print("Enter a year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		// Decide the year if it is leap year;
		boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		// Decide the input of users
		String userInput = month.substring(0, 3);
		int monthDay = 0;
		switch (month.substring(0, 3)) {
		case "Jan":
			monthDay = 31;
			break;
		case "Feb":
			monthDay = 28;
			break;
		case "Mar":
			monthDay = 31;
			break;
		case "Apr":
			monthDay = 30;
			break;
		case "May":
			monthDay = 31;
			break;
		case "Ju":
			monthDay = 30;
			break;
		case "Jul":
			monthDay = 31;
			break;
		case "Aug":
			monthDay = 31;
			break;
		case "Sep":
			monthDay = 30;
			break;
		case "Oct":
			monthDay = 31;
			break;
		case "Nov":
			monthDay = 30;
			break;
		case "Dec":
			monthDay = 31;
			break;
		default:
			System.out.println("Invalid input");
		}
		if (leap && month.substring(0, 3).equals("Feb"))
			monthDay = 29;
		System.out.println(month + " " + year + " has " + monthDay + " days ");

	}
}
