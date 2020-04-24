import java.util.Scanner;

public class answer4_11 {
	public static void main(String []args) {
		System.out.print("Enter a decimal value(0 to 15): ");
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		if (decimal <0||decimal>15) {
			System.out.print(decimal + " is an invalid value");
		}else {
			String str = Integer.toHexString(decimal);
			System.out.println("The hex value is " + str.toUpperCase());
		}
		
	}
}
