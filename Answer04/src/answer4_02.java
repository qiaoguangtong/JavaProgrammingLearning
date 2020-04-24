import java.util.Scanner;

public class answer4_02 {
	public static void main(String[] args) {
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		Scanner input = new Scanner(System.in);
		double lati1 = input.nextDouble();
		double longi1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double lati2 = input.nextDouble();
		double longi2 = input.nextDouble();
		double radius = 6371.01;

		double distance = radius * Math.acos(
				Math.sin(Math.toRadians(lati1)) * Math.sin(Math.toRadians(lati2)) + Math.cos(Math.toRadians(lati1))
						* Math.cos(Math.toRadians(lati2)) * Math.cos(Math.toRadians(longi1 - longi2)));
		System.out.println("The distance between the two points is " + distance + " km");
	}
}
