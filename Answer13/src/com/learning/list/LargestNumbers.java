package com.learning.list;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Master_Joe
 *
 */
public class LargestNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(45); // Add an integer
		list.add(3445.53); // Add a double
		// Add a BigInteger
		list.add(new BigInteger("2326464124654515645165465"));
		list.add(new BigDecimal("2.445352432543542"));
		
		System.out.println("The largest number in list is " + getLargestNumber(list));
	}

	/**  */
	public static Number getLargestNumber(ArrayList<Number> list) {
		if (list == null || list.size() == 0)
			return null;
		Number number = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		}

		return number;
	}
}
