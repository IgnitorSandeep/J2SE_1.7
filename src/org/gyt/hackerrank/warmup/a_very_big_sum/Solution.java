package org.gyt.hackerrank.warmup.a_very_big_sum;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		String numbers[] = new String[n];
		for(int i =0;i<numbers.length; i++) {
			numbers[i] = scanner.next();
		}
		
		BigInteger bigSum = new BigInteger(numbers[0].trim());
		for(int i =1;i<numbers.length; i++ ) {
			bigSum = bigSum.add(new BigInteger(numbers[i].trim()));
		}
		
		System.out.println(bigSum.toString());
		scanner.close();
		
	}

}
