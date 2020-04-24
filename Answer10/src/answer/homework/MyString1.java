package answer.homework;

/**
 * @author Master_Joe
 *
 */
public class MyString1 {
	private char[] value;

	public MyString1() {
		value = new char[0];
	}

	public MyString1(char[] chars) {
		this.value = chars;
	}

	public char charAt(int index) {
		return value[index];
	}

	public int length() {
		return value.length;
	}

	public MyString1 substring(int begin, int end) {
		if(begin > end) {
			System.out.println("ERROR: begin > end, exit!");
			System.exit(0);
		}
		char[] sub = new char[end - begin + 1];
		for (int i = begin, j = 0; i <= end; i++, j++) {
			sub[j] = value[i];
		}
		return new MyString1(sub);
	}
	
	public MyString1 toLowerCase() {
		for(int i = 0; i < value.length; i++) {
			if(value[i] <= 'Z' && value[i] >= 'A') {
				value[i] +=32;
			}
		}
		return new MyString1(value);
	}
	
	public boolean euqals(MyString1 s) {
		if(this.value == s.value)
			return true;
		else 
			return false;
	}
	
	public static MyString1 valueOf(int i) {
		char[] valueof = Character.toChars(i);
		return new MyString1(valueof);
	}
}
