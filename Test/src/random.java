
public class random {
	/** WhoWillSweepTheFloor */
	public static void main(String[] args) {
		int sweep = (int) (Math.random() * 1000) % 6 + 1;
		System.out.println(sweep);
	}
}
