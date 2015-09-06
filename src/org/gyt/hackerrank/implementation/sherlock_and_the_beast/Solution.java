package org.gyt.hackerrank.implementation.sherlock_and_the_beast;

import java.util.Scanner;

public class Solution {

	static String strFromDigit(int n, int len) {
		StringBuilder s = new StringBuilder();
		while (len > 0) {
			s.append(n);
			len--;
		}
		return s.toString();
	}

	static void buildString(int num ){
		String str = "";
		for(int j = num;j>=0;j--)
		{
			if(j%3==0 && (num-j)%5==0){
				str = strFromDigit(5,j)+strFromDigit(3, (num-j));
				break;
			}
		}
		if(str=="")
			System.out.println("-1");
		else
			System.out.println(str);
	}

	public static void main(String[] args) {
		int tcCount;
		Scanner scanner = new Scanner(System.in);
		tcCount = scanner.nextInt();
		for (int i = 0; i < tcCount; i++) {
			int length = scanner.nextInt();
			buildString(length);
		}
		scanner.close();
	}
}
