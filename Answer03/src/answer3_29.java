import java.util.Scanner;

public class answer3_29 {
	public static void main(String []args) {
		System.out.print("Enter circle1's center x-, y-coordinates and radius: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		double distance =  Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
		if (distance<Math.abs(radius1-radius2))
			System.out.println("Circle2 is inside circle.");
		else if (distance>Math.abs(radius1+radius2))
			System.out.println("Circle2 does not overlap circle1");
		else
			System.out.println("Circle2 overlaps circle1");
	}

}
