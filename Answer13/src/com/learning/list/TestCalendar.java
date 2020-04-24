package com.learning.list;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		// Construct a Gregorian calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		
		System.out.println("Current time is " + new Date());
		System.out.println("YEAR: " + calendar.YEAR);
		System.out.println("MONTH: " + calendar.MONTH);
		System.out.println("DATE: " + calendar.DATE);
		System.out.println("HOUR: " + calendar.HOUR);
		System.out.println("HOUR_OF_DAY: " + calendar.HOUR_OF_DAY);
		System.out.println("MINUTE: " + calendar.MINUTE);
		System.out.println("SECOND: " + calendar.SECOND);
		System.out.println("DAY_OF_WEEK: " + calendar.DAY_OF_WEEK);
		System.out.println("DAY_OF_MONTH: " + calendar.DAY_OF_MONTH);
		System.out.println("DAY_OF_YEAR: " + calendar.DAY_OF_YEAR);
		System.out.println("WEEK_OF_MONTH: " + calendar.WEEK_OF_MONTH);
		System.out.println("WEEK_OF_YEAR: " + calendar.WEEK_OF_YEAR);
		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		
		// Construct a calendar for September 11, 2001
		Calendar calendar2 = new GregorianCalendar(2001, 9, 11);
		String[] dayNameOfWeekStrings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("September 11, 2001 is " + dayNameOfWeekStrings[calendar2.DAY_OF_WEEK - 1]);	
	}
}