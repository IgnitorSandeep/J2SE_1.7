package org.gyt.hackerrank.warmup.Staircase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0,remain;
		for(int i =0;i<n;i++) {
			count++;
			remain = n - count;
			for(int j=0;j<remain;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<count;j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		scanner.close();
	}
	
}
