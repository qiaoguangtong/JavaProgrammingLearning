
public class answer6_11 {
	/** Financial application: compute commisions */
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("Sales Amount\tCommission");
		System.out.println("-------------------------------------");

		// Display the table body
		for (int index = 10000; index <= 100000; index += 5000) {
			System.out.printf("%-12d\t%9.1f", index, computeCommission(index));
			System.out.println();
		}
	}

	/** Return the commission */
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount <= 5000) {
			commission = salesAmount * 0.08;
		} else if (salesAmount > 5000 && salesAmount <= 10000) {
			commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
		} else {
			commission = 5000 * 0.08 + (10000 - 5000) * 0.10 + (salesAmount - 10000) * 0.12;
		}
		return commission;
	}
}
