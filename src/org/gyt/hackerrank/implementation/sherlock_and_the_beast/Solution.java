package org.gyt.hackerrank.implementation.sherlock_and_the_beast;

import java.util.Scanner;

public class Solution {

	static String possibleKey(int num ){
		char array[]=new char[num];
		while(num>0){
			if(num%5==0) {
				for(int i=0;i<num;i++) {
					array[i] = '5';
				}
			} else if(num%3==0) {
				for(int i=0;i<num;i++) {
					array[i] = '3';
				}
			}
		}

		return null;
	}

	public static void main(String[] args) {
		int tcCount;
		Scanner scanner = new Scanner(System.in);
		tcCount = scanner.nextInt();
		for (int i = 0; i < tcCount; i++) {
			int length = scanner.nextInt();
			String key = possibleKey(length);
			if (key != null)
				System.out.println(key);
			else
				System.out.println("-1");
		}
		scanner.close();
	}
}
