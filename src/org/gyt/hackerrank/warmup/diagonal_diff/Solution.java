package org.gyt.hackerrank.warmup.diagonal_diff;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n, diag1 = 0, diag2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		int matrix[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
				if (i == j)
					diag1 += matrix[i][j];
				if (i + j == n - 1)
					diag2 += matrix[i][j];
			}
		}
		
		System.out.println(Math.abs(diag1-diag2));
		scanner.close();
	}
}
