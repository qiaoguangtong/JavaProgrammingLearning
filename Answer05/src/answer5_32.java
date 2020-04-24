
public class answer5_32 {
	/** Game: lottery */
	public static void main(String[] args) {
		int lotteryDigit1 = (int) (Math.random() * 10);
		int lotteryDigit2;
		do {
			lotteryDigit2 = (int) (Math.random() * 10);
		} while (lotteryDigit2 == lotteryDigit1);
		System.out.println(Integer.toString(lotteryDigit1) + lotteryDigit2);
	}
}
