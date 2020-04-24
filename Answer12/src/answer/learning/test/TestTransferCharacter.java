package answer.learning.test;
/**
 * @author Master_Joe
 *
 */
public class TestTransferCharacter {
	public static void main(String [] args) {
		System.out.println("\\.");
		System.out.println("\\#");
		String s = "my#test#txt";
		System.out.println(s.replace("\\#", "@"));
		System.out.println(s.replaceAll("\\#", "@"));
		System.out.println(s.replaceFirst("\\.", "@"));
	}
}
