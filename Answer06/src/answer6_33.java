
public class answer6_33 {
	/** Display the time and date */
	public static void main(String[] args) {
		displayData();
		System.out.print(" ");
		displayTime();
	}

	/** Display current time */
	public static void displayTime() {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;

		currentHour += 8;
		// Display the results
		System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
	}

	/** Display the current data */
	public static void displayData() {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Get the total hours
		long totalHours = totalSeconds / 3600;

		// Get the total days
		long days = totalHours / 24;

		// Get current year
		int countYear = 0;

		for (int year = 1971; year > 0 && days > 365; year++) {
			if (isLeapYear(year)) {
				days -= 366;
			} else {
				days -= 365;
			}
			countYear++;
		}

		int currentYear = countYear + 1970;

		// Get month

		int month;
		for (month = 1; month < 13 && days > 28; month++) {
			days -= getNumberOfDaysInMonth(currentYear, month);
		}

		System.out.print("Current data is " + getMonthName(month) + " " + (days + 1) + " " + currentYear);

	}

	/** Decide if the year is leap year */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 6 || month == 4 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return isLeapYear(year) ? 29 : 28;
		return 0;
	}

	/** Get teh English name for the month */
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		return monthName;
	}
}
