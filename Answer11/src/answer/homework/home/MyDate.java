package answer.homework.home;

import java.util.Calendar;

/**
 * @author Master_Joe
 *
 */
class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		this.year = Calendar.YEAR;
		this.month = Calendar.MONTH;
		this.day = Calendar.DAY_OF_MONTH;
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	
}
