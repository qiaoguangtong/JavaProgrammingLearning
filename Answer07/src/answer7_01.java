import java.util.Scanner;

public class answer7_01 {
	/** decide order */
	public static void main(String[] args) {
		System.out.print("Enter the number of students: ");
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();

		int[] grades = new int[numberOfStudents];
		System.out.print("Enter " + numberOfStudents + " students' grade: ");
		for (int index = 0; index < grades.length; index++) {
			grades[index] = input.nextInt();
		}

		// Find the best student
		int max = 0;
		for (int index = 0; index < grades.length - 1; index++) {
			if (max < grades[index]) {
				max = grades[index];
			}
		}

		// Decide the rank;
		String[] ranks = new String[numberOfStudents];
		for (int index = 0; index < grades.length; index++) {
			int gap = max - grades[index];
			if (gap <= 10) {
				ranks[index] = "A";
			} else if (gap <= 20) {
				ranks[index] = "B";
			} else if (gap <= 30) {
				ranks[index] = "C";
			} else if (gap <= 40) {
				ranks[index] = "D";
			} else {
				ranks[index] = "F";
			}
		}

		// Display the result
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + ranks[i]);
		}
	}
}
