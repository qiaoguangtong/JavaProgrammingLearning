import java.util.Scanner;

public class answer4_24 {
	public static void main(String[] args) {
		System.out.print("Enter the first city: ");
		Scanner input = new Scanner(System.in);
		String firstCity = input.nextLine();
		System.out.print("Enter the second city: ");
		String secondCity = input.nextLine();
		System.out.print("Enter the third city: ");
		String thirdCity = input.nextLine();
		if (firstCity.compareToIgnoreCase(secondCity) > 0) {
			String temp = firstCity;
			firstCity = secondCity;
			secondCity = temp;
		}
		if (firstCity.compareToIgnoreCase(thirdCity) > 0) {
			String temp = firstCity;
			firstCity = thirdCity;
			thirdCity = temp;
		}
		if (secondCity.compareToIgnoreCase(thirdCity) > 0) {
			String temp = secondCity;
			secondCity = thirdCity;
			thirdCity = secondCity;
		}
		System.out.println(
				"The three cities in alphabetical order are " + firstCity + ", " + secondCity + " and " + thirdCity);
	}
}
