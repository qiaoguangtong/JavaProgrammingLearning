import java.text.DecimalFormat;
import java.util.Scanner;

public class answer2_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = Math.PI * radius * radius;
		double volume = area * length;
		DecimalFormat a = new DecimalFormat("#.0000");
		DecimalFormat v1 = new DecimalFormat("#.0");
		System.out.println("The area is " + a.format(area));
		System.out.println("The volume is " + v1.format(volume));
	}
}