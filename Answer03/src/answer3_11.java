import java.util.Scanner;

public class answer3_11 {
	public static void main(String[] args) {
		System.out.print("Please input month(2 stand for Feruary): ");
		Scanner input = new Scanner(System.in);
		int monthNum = input.nextInt();
		System.out.print("Please input year: ");
		int year = input.nextInt();
		boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String month = "";
		int monthDay = 0;
		switch (monthNum) {
		case 1:
			month = "January";
			monthDay = 31;
			break;
		case 2:
			month = "February";
			monthDay = 28;
			break;
		case 3:
			month = "March";
			monthDay = 31;
			break;
		case 4:
			month = "April";
			monthDay = 30;
			break;
		case 5:
			month = "May";
			monthDay = 31;
			break;
		case 6:
			month = "June";
			monthDay = 30;
			break;
		case 7:
			month = "July";
			monthDay = 31;
			break;
		case 8:
			month = "August";
			monthDay = 31;
			break;
		case 9:
			month = "September";
			monthDay = 30;
			break;
		case 10:
			month = "October";
			monthDay = 31;
			break;
		case 11:
			month = "November";
			monthDay = 30;
			break;
		case 12:
			month = "December";
			monthDay = 31;
			break;
		default:
			System.out.println("Month ERROR!!!");
			break;
		}
		if (monthNum>12||monthNum<1)
			return;
		if (leap&&(monthNum==2))
			monthDay = 29;
		System.out.println(month + " " + year + " has " + monthDay + " days !");
	}
}
