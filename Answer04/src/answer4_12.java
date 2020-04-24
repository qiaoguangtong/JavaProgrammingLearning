import java.util.Scanner;

public class answer4_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexadecimal = input.next();
		// Convert hexadecimal to decimal in Java
		int decimal = Integer.parseInt(hexadecimal,16);
		System.out.println("Converted decimal number is " + decimal);
		// Convert hexadecimal to binary in Java
		String binary = Integer.toBinaryString(decimal);
		System.out.printf("Hexadecimal to Binary conversion of %s is %s \n", hexadecimal, binary);
		
	}
}