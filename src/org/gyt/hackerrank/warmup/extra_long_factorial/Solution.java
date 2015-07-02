package org.gyt.hackerrank.warmup.extra_long_factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	static BigInteger factorial(int number) {
		BigInteger fact = new BigInteger("1");
		while (number > 0) {
			fact = fact.multiply(new BigInteger("" + number));
			number--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(factorial(number));
		scanner.close();
	}

}
