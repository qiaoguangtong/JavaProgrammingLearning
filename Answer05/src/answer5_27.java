
public class answer5_27 {
	/** Display leap years */
	public static void main(String[] args) {
		int count = 0;

		// Display the leap years
		for (int year = 101; year <= 2100; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				System.out.print(year + "\t");
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}
}
