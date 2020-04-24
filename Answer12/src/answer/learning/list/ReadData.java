package answer.learning.list;

import java.io.File;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class ReadData {
	public static void main(String [] args) throws Exception {
		// Create a File instance 
		File file = new File("scores.txt");
		
		// Create a Scanner
		Scanner scanner = new Scanner(file);
		
		// Read data from a file
		while(scanner.hasNext()) {
			String firstName = scanner.next();
			String mi = scanner.next();
			String lastName = scanner.next();
			int score = scanner.nextInt();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}
		
		// Close
		scanner.close();
	}
}
