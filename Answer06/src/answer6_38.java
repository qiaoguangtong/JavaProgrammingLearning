import List.list6_10;

public class answer6_38 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("The upper cases:");
		for (int index = 0; index < 100; index++) {
			System.out.print(list6_10.getUpperCaseLetter() + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println("The single-number: ");
		count = 0;
		for (int index = 0; index < 100; index++) {
			System.out.print(list6_10.getRandomCharacter('0', '9') + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
}
