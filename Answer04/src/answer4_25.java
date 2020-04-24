
public class answer4_25 {
	public static void main(String[] args) {
		String number = new String();
		char a = (char) (int) ((Math.random() * 10) + 65);
		char aa = (char) (int) ((Math.random() * 10) + 65);
		char aaa = (char) (int) ((Math.random() * 10) + 65);
		number = Character.toString(a) + Character.toString(aa) + Character.toString(aaa);
		int number0 = (int) (Math.random() * 999);
		number = number + Integer.toString(number0);
		System.out.println("A random license plate number is " + number);
	}
}
