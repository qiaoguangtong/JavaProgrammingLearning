package answer.homework.practice;

import java.io.File;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_26 {
	public static void main(String[] args) {
		System.out.print("Enter a directory name: ");
		Scanner input = new Scanner(System.in);
		String directoryName = input.nextLine();
		File file = new File(directoryName);
		if (file.mkdirs()) {
			System.out.println("Directory " + directoryName + " created");
		} else {
			System.out.println("Directory " + directoryName + " already exists");
		}
	}
}
