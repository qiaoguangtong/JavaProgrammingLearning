import java.util.Scanner;

public class answer3_17 {
	public static void main(String[] args) {
		System.out.print("scissor (0), rock (1), paper (2): ");
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		int com = (int) (Math.random() * 10 % 3);
		if (com == 0 && user == 0)
			System.out.println("The computer is scissor. You are scissor too. It is a draw.");
		else if (com == 0 && user == 1)
			System.out.println("The computer is scissor. You are rock. You won.");
		else if (com == 0 && user == 2)
			System.out.println("The computer is scissor. You are paper. You lost.");
		else if (com == 1 && user == 0)
			System.out.println("The computer is rock. You are scissor. You lost.");
		else if (com == 1 && user == 1)
			System.out.println("The computer is rock. You are rock too. It is a draw.");
		else if (com == 1&& user == 2)
			System.out.println("The computer is rock. You are paper. You won.");
		else if (com == 2&& user ==0)
			System.out.println("The computer is paper. You are scissor. You won.");
		else if (com == 2 && user == 1)
			System.out.println("The computer is paper. You are rock. You lost.");
		else if (com == 2 && user ==2)
			System.out.println("The computer is paper. You are paper. It is a draw.");
	}
}
