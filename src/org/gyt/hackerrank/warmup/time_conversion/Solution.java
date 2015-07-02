package org.gyt.hackerrank.warmup.time_conversion;

import java.util.Scanner;

public class Solution {

	static String get24HrsFormatTime(String time) {
		String in24HrsFormat = null;
		int temp = Integer.parseInt(time.substring(0, 2));
		if (time.contains("AM")) {
			if(temp==12)
				in24HrsFormat = "00"+time.substring(2, 8);
			else
				in24HrsFormat = time.substring(0, 8);
		} else if (time.contains("PM")) {
			if(temp<12)
				temp=temp+12;
			in24HrsFormat = temp + time.substring(2, 8);
		} else {
			in24HrsFormat = time;
		}

		return in24HrsFormat;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.next();
		// 07:05:45PM
		System.out.println(get24HrsFormatTime(time));
		scanner.close();

	}

}
