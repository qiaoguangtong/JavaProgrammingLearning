import java.util.Scanner;

public class answer3_14 {
	public static void main(String[] args) {
		int coverNum = (int) (Math.random() * 10 % 2);
		String cover = "";
		if (coverNum == 1)
			cover = "front";
		else
			cover = "back";
		System.out.println("Enter your guess(1 stands for front, and 0 stands for back): ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		if (guess == coverNum)
			System.out.println("You are right, the coin is " + cover);
		else
			System.out.println("You are wrong, the right is " + cover);
	}
}