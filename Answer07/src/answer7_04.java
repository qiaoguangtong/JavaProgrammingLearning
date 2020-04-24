import java.util.Scanner;

public class answer7_04 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the grade: ");

		double[] grades = new double[1024];
		int index;
		for (index = 0; index < grades.length; index++) {
			grades[index] = input.nextDouble();
			if (grades[index] < 0) {
				break;
			}
			if (grades[index] > 100) {
				System.out.println("ERROR!! The grade must be less than 100;");
				System.exit(1);
			}
		}

		double sum = 0;

		for (int i = 0; i < index; i++) {
			sum += grades[i];
		}

		double average = sum / index;
		int sameCount = 0;
		int lessCount = 0;
		int greaterCount = 0;
		for (int i = 0; i < index; i++) {
			if (grades[i] > average) {
				greaterCount++;
			} else if (grades[i] < average) {
				lessCount++;
			} else
				sameCount++;
		}

		System.out.println(greaterCount + " students\' grade are greater than average.");
		System.out.println(sameCount + " students\' grade are same as average.");
		System.out.println(lessCount + " students\' grade are less than average.");
	}

}
