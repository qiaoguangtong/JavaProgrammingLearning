package answer.learning.list;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class WebCrawler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url);
		input.close();
	}

	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();

		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraversedURLs.contains(urlString)) {
				listOfTraversedURLs.add(urlString);
				System.out.println("Crael: " + urlString);
				for (String s : getSubURLs(urlString)) {
					if(!listOfTraversedURLs.contains(s)) {
						listOfPendingURLs.add(s);
					}
				}
			}
		}
	}

	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {// Ensure that a correct URL is found
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", current);
					} else {
						current = -1;
					}
				}
				
			}input.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return list;
	}
}
