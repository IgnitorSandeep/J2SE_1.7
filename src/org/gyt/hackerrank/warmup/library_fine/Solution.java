package org.gyt.hackerrank.warmup.library_fine;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int actualDD, actualMM, actualYYYY;
		int expectedDD, expectedMM, expectedYYYY;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			actualDD = scanner.nextInt();
			actualMM = scanner.nextInt();
			actualYYYY = scanner.nextInt();

			expectedDD = scanner.nextInt();
			expectedMM = scanner.nextInt();
			expectedYYYY = scanner.nextInt();

			if (actualYYYY == expectedYYYY || actualYYYY < expectedYYYY) {
				if (actualYYYY < expectedYYYY) {
					System.out.println("0");
					return;
				}
				if (actualMM == expectedMM || actualMM < expectedMM) {
					if (actualMM < expectedMM) {
						System.out.println("0");
						return;
					}
					if (actualDD == expectedDD || actualDD < expectedDD) {
						System.out.println("0");
						return;
					} else {
						System.out.println(15 * (actualDD - expectedDD));
						return;
					}
				} else {
					System.out.println(500 * (actualMM - expectedMM));
					return;
				}
			} else {
				System.out.println("10000");
				return;
			}
		} finally {
			scanner.close();
		}
	}

}