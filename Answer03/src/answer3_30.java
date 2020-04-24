import java.util.Scanner;

public class answer3_30 {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		long gap = input.nextLong();
		currentHour += gap;
		while (currentHour > 12)
			currentHour -= 12;
		while (currentHour < 0)
			currentHour += 12;
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}