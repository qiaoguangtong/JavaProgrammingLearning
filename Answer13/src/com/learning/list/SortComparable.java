package com.learning.list;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Master_Joe
 *
 */
public class SortComparable {
	public static void main(String[] args) {
		String[] cities = { "Sacannah", "Boston", "Atlanta", "Tampa" };
		Arrays.sort(cities);
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();

		BigInteger[] hugeNumbers = { new BigInteger("23232313729487392"), new BigInteger("46871654654654654615646"),
				new BigInteger("56549321465461654") };
		Arrays.sort(hugeNumbers);
		for (BigInteger huge : hugeNumbers) {
			System.out.print(huge + " ");
		}
	}
}
