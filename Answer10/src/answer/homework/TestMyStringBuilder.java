package answer.homework;
/**
 * @author Master_Joe
 *
 */
public class TestMyStringBuilder {
	public static void main(String[] args) {
		MyStringBuilder2 testString1 = new MyStringBuilder2("HowAreYou");
		char[] chars = {'H', 'o', 'w', 'A', 'r', 'e', 'Y', 'o', 'u'};
		MyStringBuilder2 testchars = new MyStringBuilder2(chars);
		
		System.out.println("MyStringBuilder2 testString1 = new MyStringBuilder2(\"HowAreYou\");\r\n" + 
				"char[] chars = {'H', 'o', 'w', 'A', 'r', 'e', 'Y', 'o', 'u'};\r\n" + 
				"MyStringBuilder2 testchars = new MyStringBuilder2(chars);");
		System.out.println();
		System.out.println("testString1.insert(5, testchars).toString() is " + testString1.insert(5, testchars).toString());
		System.out.println("testString1.reverse().toString() is "+ testString1.reverse().toString());
		System.out.println("testString1.substring(5).toString() is " + testString1.substring(5).toString());
		System.out.println("testString1.toUpperCase().toString() is " + testString1.toUpperCase().toString());
	}
}
