import java.util.Scanner;

public class answer6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of millis as a long integer: ");
		long millis = input.nextLong();
		System.out.println(convertMillis(millis));
	}

	public static String convertMillis(long millis) {

		long totalSeconds = millis/1000;

		long hours = totalSeconds/3600;

		long minutes = totalSeconds/60%60;

		long seconds = totalSeconds%60;

		String result = hours + " : " + minutes + " : " + seconds;
		return result;
	}
}
