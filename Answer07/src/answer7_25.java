import java.util.Scanner;

public class answer7_25 {
	public static void main(String[] args) {
		double[] eqn = new double[3];
		double[] roots = new double[3];

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b and c: ");
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = input.nextDouble();
		}

		double root = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
		if (root < 0) {
			System.out.println("The root for this equation has no real root!!");
			System.exit(0);
		}
		System.out.print("The root for this equation is ");
		if (root == 0) {
			roots[0] = (-eqn[1] + Math.sqrt(root)) / (2 * eqn[0]);
			System.out.print(roots[0]);
		} else if (root > 0) {
			roots[0] = (-eqn[1] + Math.sqrt(root)) / (2 * eqn[0]);
			roots[1] = (-eqn[1] - Math.sqrt(root)) / (2 * eqn[0]);
			System.out.print(roots[0] + " and " + roots[1]);
		}
		input.close();
	}
}
