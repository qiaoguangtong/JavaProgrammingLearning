import java.util.Scanner;

public class answer3_08 {
	public static void main(String[] args) {
		System.out.print("Enter three integers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a < b) {
			int temp;
			temp = a;
			a = b;
			b = temp;
		}
		if (a < c) {
			int temp;
			temp = a;
			a = c;
			c = temp;
		}
		if (b < c) {
			int temp;
			temp = b;
			b = c;
			c = temp;
		}
		int i = (int) ((Math.random() * 10) % 5);
		switch (i) {
		case 0:
			System.out.println(a + "\t" + c + "\t" + b);
			break;
		case 1:
			System.out.println(b + "\t" + c + "\t" + a);
			break;
		case 2:
			System.out.println(b + "\t" + a + "\t" + c);
			break;
		case 3:
			System.out.println(c + "\t" + a + "\t" + b);
			break;
		case 4:
			System.out.println(c + "\t" + b + "\t" + a);
			break;
		}

	}
}
