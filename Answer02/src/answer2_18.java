
public class answer2_18 {
	public static void main(String[] args) {
		System.out.println("a\tb\tpow(a,b)");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "\t" + (i + 2) + "\t" + (int) Math.pow(i + 1, i + 2));
		}
	}
}
