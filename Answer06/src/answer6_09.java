
public class answer6_09 {
	/** Conversioins between feet and meters */
	public static void main(String[] args) {
		// Display the table heading 
		System.out.println("Feet \tMeters \t|  Meters\tFeet");
		
		// Display the table body
		for (double i = 1, j = 20; i<=10&&j<=65;i = i+1, j = j+5) {
			System.out.printf("%-4.1f \t%-6.3f \t|  %-6.1f\t%-6.3f", i,footToMeter(i), j, meterToFoot(j));
			System.out.println();
		}
	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}

	/** Convert from meter to feet */
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}
