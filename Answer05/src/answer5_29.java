import java.util.Scanner;

public class answer5_29 {
	/** Display calendars */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the information
		System.out.print("Enter the year which you wanna watch: ");
		int year = input.nextInt();
		System.out.print("Enter the first day in a week: ");
		int weekDay = input.nextInt();

		// Show the calendar
		for (int month = 1; month < 13; month++) {
			String monthString = new String();
			int weekDay0 = weekDay;
			int daysFeb = 28;
			int monthDay = 0;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				daysFeb = 29;
			}
			switch (month) {
			case 1:
				monthString = "January";
				weekDay0 += 0;
				monthDay = 31;
				break;
			case 2:
				monthString = "February";
				weekDay0 += 31;
				monthDay = daysFeb;
				break;
			case 3:
				monthString = "March";
				weekDay0 += 31 + daysFeb;
				monthDay = 31;
				break;
			case 4:
				monthString = "April";
				weekDay0 += 31 + daysFeb + 31;
				monthDay = 30;
				break;
			case 5:
				monthString = "May";
				weekDay0 += 31 + daysFeb + 31 + 30;
				monthDay = 31;
				break;
			case 6:
				monthString = "June";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31;
				monthDay = 30;
				break;
			case 7:
				monthString = "July";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30;
				monthDay = 31;
				break;
			case 8:
				monthString = "August";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30 + 31;
				monthDay = 31;
				break;
			case 9:
				monthString = "September";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30 + 31 + 31;
				monthDay = 30;
				break;
			case 10:
				monthString = "October";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				monthDay = 31;
				break;
			case 11:
				monthString = "November";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				monthDay = 30;
				break;
			case 12:
				monthString = "December";
				weekDay0 += 31 + daysFeb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				monthDay = 31;
				break;
			}
			// Display the table heading
			System.out.println("\t\t" + monthString + "  " + year);
			System.out.println("---------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			int tapCount = 0;
			for (int k = 1; k <= weekDay0 % 7; k++) {
				System.out.printf("%3s\t", " ");
				tapCount++;
			}
			int tapCount2 = tapCount;
			for (int i = 1; i <= monthDay; i++) {
				System.out.printf("%3s\t", Integer.toString(i));
				tapCount2++;
				if (tapCount2 % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}