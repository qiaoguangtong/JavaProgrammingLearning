
public class answer6_16 {
	/** Days for one year */
	public static void main(String[] args) {
		for (int year = 2000; year <= 2020; year++) {
			System.out.println("There are " + numberOfDaysInAYear(year) + " days in " + year);
		}
	}

	/** Return the number of the days in a year */
	public static int numberOfDaysInAYear(int year) {
		int days = 0;
		if (isLeapYear(year))
			days = 366;
		else
			days = 365;
		return days;
	}

	/** Determine if the year is leap year */
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return true;
		return false;
	}
}
