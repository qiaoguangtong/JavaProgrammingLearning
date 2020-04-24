package answer.homework.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class Answer12_13 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Test.txt");
		Scanner scanner = new Scanner(file);
		if (!file.exists()) {
			System.out.println("Error: File not exists!");
			System.exit(1);
		}
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			String [] words = str.split("[ \t \n \r]");
			for(String word: words) {
				if(word.length() > 0) {
					wordCount++;
				}
			}
			lineCount++;
			charCount += str.length();
		}

		System.out.println("File " + file.getName() + " has " + "\n " + charCount + " characters");
		System.out.println(wordCount + " words ");
		System.out.println(lineCount + " lines");

	}
}
