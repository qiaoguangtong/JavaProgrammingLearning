package list;

import java.math.BigInteger;

public class LargeFactorial {
	public static void main(String [] args) {
		System.out.println("50! is \n" + factorial(50));
	}
	
	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(Integer.toString(i)));
		
		return result;
	}
}
