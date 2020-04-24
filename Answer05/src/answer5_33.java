
public class answer5_33 {
	/** Perfect number */
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if (sum == i) {
				System.out.print(i);
				System.out.print(" = ");
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						System.out.print(j);
						if(j == i/2)
							break;
						System.out.print(" + ");
					}
				}
				System.out.println();
			}
		}
	}
}
