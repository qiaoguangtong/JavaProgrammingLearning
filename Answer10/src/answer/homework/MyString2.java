package answer.homework;

/**
 * @author Master_Joe
 *
 */
//public class MyString2 {
//	private char[] value;
//
//	public MyString2() {
//		value = new char[0];
//	}
//
//	public MyString2(String s) {
//		value = s.toCharArray();
//	}
//
//	public int compare(String s) {
//		int n1 = value.length;
//		int n2 = s.length();
//		int min = Math.min(n1, n2);
//		for (int i = 0; i < min; i++) {
//			char c1 = value[i];
//			char c2 = s.charAt(i);
//			if (c1 != c2) {
//				c1 = Character.toUpperCase(c1);
//				c2 = Character.toUpperCase(c2);
//				if (c1 != c2) {
//					c1 = Character.toLowerCase(c1);
//					c2 = Character.toLowerCase(c2);
//					if (c1 != c2) {
//						// No overflow because of numeric promotion
//						return c1 - c2;
//					}
//				}
//			}
//		}
//		return n1 - n2;
//	}
//
//	public MyString2 substring(int begin) {
//		char[] sub = new char[value.length - begin + 1];
//		for (int i = begin, j = 0; i < value.length; i++, j++)
//			sub[j] = value[i];
//		return new MyString2(new String(sub));
//
//	}
//
//	public MyString2 toUpperCase() {
//		for (int i = 0; i < value.length; i++) {
//			if (value[i] < 'z' && value[i] > 'a') {
//				value[i] -= 32;
//			}
//		}
//		return new MyString2(value.toString());
//	}
//
//	public char[] toChars() {
//		return value;
//	}
//
//	public static MyString2 valueOf(boolean b) {
//		if (b == true)
//			return new MyString2("true");
//		else
//			return new MyString2("false");
//	}
//
//	@Override
//	public String toString() {
//		return new String(this.value);
//	}
//}

public class MyString2 {
	private String string;

	public MyString2() {
		string = new String();
	}

	public MyString2(String s) {
		string = s;
	}

	public int compare(String s) {
		int n1 = string.length();
		int n2 = s.length();
		int min = Math.min(n1, n2);
		for (int i = 0; i < min; i++) {
			char c1 = string.charAt(i);
			char c2 = s.charAt(i);
			if (c1 != c2) {
				c1 = Character.toUpperCase(c1);
				c2 = Character.toUpperCase(c2);
				if (c1 != c2) {
					c1 = Character.toLowerCase(c1);
					c2 = Character.toLowerCase(c2);
					if (c1 != c2) {
						// No overflow because of numeric promotion
						return c1 - c2;
					}
				}
			}
		}
		return n1 - n2;

	}

	public MyString2 substring(int begin) {
		return new MyString2(string.substring(begin));
	}

	public MyString2 toUpperCase() {
		return new MyString2(string.toUpperCase());
	}

	public char[] toChars() {
		return string.toCharArray();
	}

	public static MyString2 valueOf(boolean b) {
		return new MyString2(String.valueOf(b));
	}

	@Override
	public String toString() {
		return new String(string);
	}
}

class TestMyString2 {

	public static void main(String[] args) {
		MyString2 string2 = new MyString2("How");
		String string = new String("HowDoYouDo");
		boolean b = true;
		System.out.println("MyString2 string2 = new MyString2(\"How\");");
		System.out.println("boolean b = true;");
		System.out.println("String string = new String(\"HowDoYouDo\");");
		System.out.println("string2.compare(string22) is " + string2.compare(string));
		System.out.println("string2.subString(0).toString() is " + string2.substring(0));
		System.out.println("string2.toUpperCase().toString() is " + string2.toUpperCase().toString());
		System.out.println("String.valueOf(string2.toChars()) is " + String.valueOf(string2.toChars()));
		System.out.println("MyString2.valueOf(b) is " + MyString2.valueOf(b));
	}
}
