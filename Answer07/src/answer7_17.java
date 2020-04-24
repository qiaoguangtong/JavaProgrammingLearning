import java.util.Scanner;

public class answer7_17 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of the student: ");
		int numberOfStudent = input.nextInt();
		double[] studentsGoal = new double[numberOfStudent];
		String[] studentsName = new String[numberOfStudent];
		System.out.print("Enter the students\' name and the goal of the students: ");
		for (int i = 0; i < studentsName.length; i++) {
			studentsName[i] = input.next();
			studentsGoal[i] = input.nextDouble();
		}

		// Sort the goals and swap the students' name
		bubbleSort(studentsGoal, studentsName);
		
		// Display the results
		System.out.println("The students' name ordered by their goals are: ");
		for(int i = studentsGoal.length - 1; i>=0; i--) {
			System.out.println(studentsName[i]);
		}
	}

	/** Bubble Sort: From low to high*/
	public static void bubbleSort(double[] arr, String[] arrString) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) { // Prevent overflow
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					String tempString = arrString[j];
					arrString[j] = arrString[j + 1];
					arrString[j + 1] = tempString;
				}
			}
		}
	}
}