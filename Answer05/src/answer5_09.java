import java.util.Scanner;

public class answer5_09 {
	/** Find the two highest students */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of the student: ");
		int numberOfStudent = input.nextInt();

		double score1 = 0;
		double score2 = 0;
		String student1 = "";
		String student2 = "";

		System.out.print("Enter a student\'s name: ");
		student1 = input.next();
		System.out.print("Enter a student\'s score: ");
		score1 = input.nextDouble();

		System.out.print("Enter a student\'s name: ");
		student2 = input.next();
		System.out.print("Enter a student\'s score: ");
		score2 = input.nextDouble();

		// Make sure the best student is student1
		// and the second student is student2
		if (score1 < score2) {
			String tempString = student1;
			double tempScore = score1;

			student1 = student2;
			score1 = score2;

			student2 = tempString;
			score2 = tempScore;
		}

		// For loop
		for (int count = 0; count < numberOfStudent - 2; count++) {

			System.out.print("Enter a student\'s name: ");
			String student = input.next();
			System.out.print("Enter a student\'s score: ");
			double score = input.nextDouble();

			if (score > score1) {
				score2 = score1;
				student2 = student1;// Student1 now is the second one

				student1 = student;
				score1 = score; // student now is the best one
			} else if (score > score2) {
				score2 = score;
				student2 = student; // student now is the second one
			}
		} // End for loop

		System.out.println("The best student is " + student1 + ", and his score is " + score1);
		System.out.println("The second student is " + student2 + ", and his score is " + score2);
	}
}