import java.util.Scanner;

public class answer3_21 {
	public static void main(String[] args) {
		System.out.print("Enter year (e.g., 2012): ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("Enter month(1-12): ");
		int month = input.nextInt();
		if (month == 1 || month == 2) {
			month += 12;
			year-=1;
		}
		System.out.print("Enter the day of the month (1-31): ");
		int day = input.nextInt();
		int j = year / 100;
		int k = year % 100;
		int h = (day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String week = "";
		switch (h) {
		case 2:
			week = "Monday";
			break;
		case 3:
			week = "Tuesday";
			break;
		case 4:
			week = "Wednesday";
			break;
		case 5:
			week = "Thursday";
			break;
		case 6:
			week = "Friday";
			break;
		case 0:
			week = "Saturday";
			break;
		case 1:
			week = "Sunday";
			break;
		}
		System.out.println("Day of the week is " + week);
	}
}
