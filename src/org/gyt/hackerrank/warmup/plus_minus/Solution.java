package org.gyt.hackerrank.warmup.plus_minus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalNumCount = scanner.nextInt();
		int posNumCount = 0, negNumCount = 0, zeroNumCount = 0, num;

		for (int i = 0; i < totalNumCount; i++) {
			num = scanner.nextInt();
			if (num == 0)
				zeroNumCount++;
			if (num < 0)
				negNumCount++;
			if (num > 0)
				posNumCount++;
		}
		float fraction = 0;
		
		DecimalFormat numberFormat = new DecimalFormat("#0.000");

		fraction = (float) posNumCount / totalNumCount;
		System.out.println(numberFormat.format(fraction));
		
		fraction = (float) negNumCount / totalNumCount;
		System.out.println(numberFormat.format(fraction));

		fraction = (float) zeroNumCount / totalNumCount;
		System.out.println(numberFormat.format(fraction));

		scanner.close();
	}

}
