import java.util.Scanner;

public class answer5_28 {
	/** Display the first days of each month */
	public static void main(String[] args) {
		System.out.print("Please enter the year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("Enter the day in a week: ");
		int weekDay = input.nextInt();

		for (int i = 1; i <= 12; i++) {
			String month = new String();
			int weekDay0 = weekDay;
			double two = 28;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				two = 29;
			}
			switch (i) {
			case 1:
				month = "January";
				weekDay0 += 0;
				break;
			case 2:
				month = "February";
				weekDay0 += 31;
				break;
			case 3:
				month = "March";
				weekDay0 += 31 + two;
				break;
			case 4:
				month = "April";
				weekDay0 += 31 + two + 31;
				break;
			case 5:
				month = "May";
				weekDay0 += 31 + two + 31 + 30;
				break;
			case 6:
				month = "June";
				weekDay0 += 31 + two + 31 + 30 + 31;
				break;
			case 7:
				month = "July";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30;
				break;
			case 8:
				month = "August";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				month = "September";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				month = "October";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				month = "November";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				month = "December";
				weekDay0 += 31 + two + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}
			System.out.print(month + " 1, " + year + " is ");

			String weekString = new String();
			switch (weekDay0 % 7) {
			case 0:
				weekString = "Sunday";
				break;
			case 1:
				weekString = "Monday";
				break;
			case 2:
				weekString = "Tuesday";
				break;
			case 3:
				weekString = "Wednesday";
				break;
			case 4:
				weekString = "Thursday";
				break;
			case 5:
				weekString = "Friday";
				break;
			case 6:
				weekString = "Saturday";
			}
			System.out.println(weekString);
		}
	}
}
