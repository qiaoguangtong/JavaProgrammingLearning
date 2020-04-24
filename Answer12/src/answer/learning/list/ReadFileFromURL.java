package answer.learning.list;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class ReadFileFromURL {
	public static void main(String []args) {
		System.out.print("Enter a URL: ");
		Scanner scanner = new Scanner(System.in);
		String URLString = scanner.next();
		scanner.close();
		try {
			URL url = new URL(URLString);
			int count  = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				count+=line.length();
			}
			input.close();
			System.out.println("The file size is " + count + " characters");
		}catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		}catch(IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
