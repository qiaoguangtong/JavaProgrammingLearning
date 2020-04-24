package answer.homework.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_14 {
	public static void main(String [] args) throws FileNotFoundException {
		File file = new File("scores.txt");
		Scanner scanner = new Scanner(file);
		double sum = 0; 
		int count=0;
		while(scanner.hasNext()) {
			sum += scanner.nextDouble();
			count++;
		}
		double average = sum / count;
		System.out.println("The sum is " + sum + " and the average is " + average);
		scanner.close();
	}
}
