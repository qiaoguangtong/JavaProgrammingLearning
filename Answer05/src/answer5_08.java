import java.util.Scanner;

public class answer5_08 {
	/** Find the highest score */
	public static void main(String[] args) {

		System.out.print("Enter the number of the students: ");
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int numberOfStudent = input.nextInt();

		String maxStudent = "";
		double score = 0;
		double maxScore = 0;

		// Check the student who has the highest score
		for (int i = 0; i < numberOfStudent; i++) {
			// Prompt the user enter the score and the name of the student
			System.out.print("Enter the score of a student(terminate using enter): ");
			score = input.nextDouble();
			System.out.print("Enter the student's name(the input ends if the last is #): ");
			String name = input.next();
			/*while (true) {
				s = input.next();
				if (s.charAt(s.length() - 1) == '#')
					break; // Ends if the last is #
			}*/
			// Find the max score and the student's name
			if (score > maxScore) {
				maxScore = score;
				maxStudent = name;
			}
		}

		System.out.println("The student with the highest score is "+ maxStudent);
		System.out.println("The highest score is " + maxScore);
	}
}
