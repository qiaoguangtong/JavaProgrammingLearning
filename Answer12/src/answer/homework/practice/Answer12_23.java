package answer.homework.practice;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_23 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("file:///E:/eclipse-workspace/Answer12/scores.txt");
		Scanner scanner = new Scanner(url.openStream());
		double sum = 0;
		int count = 0;
		while (scanner.hasNext()) {
			sum += scanner.nextDouble();
			count++;
		}
		double average = sum / count;
		System.out.println("The sum is " + sum + " and the average is " + average);
		scanner.close();
	}
}
