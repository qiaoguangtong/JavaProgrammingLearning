
public class answer5_40 {
	/** Simulation: heads or tails */
	public static void main(String[] args) {
		int headCount = 0;
		int tailCount = 0;
		for (int i = 0; i < 1000000; i++) {
			int coin = (int) (Math.random() * 10) % 2;
			if (coin == 1) {
				headCount++;
			} else if (coin == 0) {
				tailCount++;
			}
		}
		System.out.println("The number of head is " + headCount + ", and the number of tail is " + tailCount);
	}
}
