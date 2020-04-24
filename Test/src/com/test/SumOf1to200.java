package com.test;

import java.util.Scanner;

/**
 * @author Master_Joe
 *
 */
public class SumOf1to200 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i <= 200) {
			sum += i;
			i++;
		}

		System.out.println(sum);
	}
}

class Enter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "How are you\n";
		System.out.print(s1);
		int i = input.nextInt();

		String s2 = "How are you \r";
		System.out.print(s2);
		double d = input.nextDouble();

		String s3 = "How are you \r\n";
		System.out.print(s3);
		double dou = input.nextDouble();

		System.out.println("Hello, world");
	}
}