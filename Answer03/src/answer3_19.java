import java.util.Scanner;

public class answer3_19 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the three edges of a triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		double s = 0;
		if ((edge1 +edge2>edge3)&&(edge1+edge3>edge2)&&(edge2+edge3>edge1) )
			System.out.println("The perimeter of this triangle is " + (edge1 + edge2 + edge3));
		else 
			System.out.println("The three edges cannot be the three edges of a triangle!");
	}

}
