package answer.homework;

/**
 * @author Master_Joe
 *
 */
class MyStringBuilder2 {
	String str;

	public MyStringBuilder2() {

	}

	public MyStringBuilder2(char[] chars) {
		String string = new String();
		for(int i = 0; i < chars.length; i++) {
			string += Character.toString(chars[i]);
		}
		this.str = string;
	}

	public MyStringBuilder2(String s) {
		this.str = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String string = new String();
		for (int i = 0; i < offset; i++) {
			string += Character.toString(str.charAt(i));
		}
		string += s;
		for (int i = offset; i < str.length(); i++) {
			string += Character.toString(str.charAt(i));
		}

		return new MyStringBuilder2(string);
	}

	public MyStringBuilder2 reverse() {
		String string = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
			string += Character.toString(str.charAt(i));
		}
		return new MyStringBuilder2(string);
	}

	public MyStringBuilder2 substring(int begin) {
		String string = new String();
		for (int i = begin; i < str.length(); i++) {
			string += Character.toString(str.charAt(i));
		}
		return new MyStringBuilder2(string);
	}

	public MyStringBuilder2 toUpperCase() {
		String string = new String();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 'z' && str.charAt(i) > 'a') {
				string += Character.toString((char) (str.charAt(i) - 32));
			} else {
				string += Character.toString(str.charAt(i));
			}
		}
		return new MyStringBuilder2(string);
	}

	@Override
	public String toString() {
		return str;
	}
}

