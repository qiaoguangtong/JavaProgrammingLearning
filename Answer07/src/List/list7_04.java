package List;

public class list7_04 {
	/** CountLettersInArray */
	public static void main(String[] args) {
		// Declare and create an array
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are: ");
		displayCounts(counts);
	}

	/** Create an array of characters */
	public static char[] createArray() {
		// Declare an array of characters and create it
		char[] chars = new char[100];

		// Create lower case letter randomly and
		// assign them to the array
		for (int i = 0; i < chars.length; i++) {
			chars[i] = list6_10.getRandomeLowerCase();
		}
		return chars;
	}

	/** Display the array of character */
	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	/** Count the occurrences of each letter */
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lower case in the array, count it
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}

		return counts;
	}

	/** Display counts */
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + "" + (char) (i + 'a'));
			} else
				System.out.print(counts[i] + "" + (char) (i + 'a') + " ");
		}
	}
}
