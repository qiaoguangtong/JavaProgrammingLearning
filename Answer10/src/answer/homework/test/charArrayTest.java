package answer.homework.test;

/**
 * @author Master_Joe
 *
 */
public class charArrayTest {
	public static void main(String[] args) {
		char[] chars = { 'H', 'o', 'w', ' ', 'A', 'r', 'e', ' ', 'Y', 'o', 'u' };
		String string = new String();
		for (int i = 0; i < chars.length; i++) {
			string += Character.toString(chars[i]);
		}
		System.out.println(string);
	}
}
