package org.gyt.hackerrank.implementation.sherlock_and_square;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int tc;
		Scanner sc = new Scanner(System.in);
		tc = sc.nextInt();

		int leftBound[] = new int[tc];
		int rightBound[] = new int[tc];
		for (int i = 0; i < tc; i++) {
			leftBound[i] = sc.nextInt();
			rightBound[i] = sc.nextInt();
			countSquare(leftBound[i], rightBound[i]);
		}
		sc.close();
	}

	static void countSquare(int left, int right) {
		int square = 0;
		int lowNum = 0;
		/**
		 * looking for the first perfect square
		 */
		for (int i = left; i <= right; i++) {
			int sqrt = (int) Math.sqrt(i);
			if ((sqrt * sqrt) == i) {
				square++;
				lowNum = sqrt;
				break;
			}
		}
		// System.out.println("low num : "+lowNum);
		if (lowNum != 0) {
			for (int i = (lowNum + 1); (i * i) <= right; i++) {
				square++;
			}
		}
		System.out.println(square);
	}
}