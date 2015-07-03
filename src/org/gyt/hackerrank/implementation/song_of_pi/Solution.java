package org.gyt.hackerrank.implementation.song_of_pi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	static final String PI = "3.1415926535897932384626433833";
	static final String A_PI_SONG = "It's a pi song.";
	static final String NOT_A_PI_SONG = "It's not a pi song.";

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int tc = scanner.nextInt();
			scanner.nextLine();

			for (int i = 0; i < tc; i++) {
				char newPIArray[] = new char[PI.length()];
				int k = 0;
				String song = scanner.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(song, " ");
				while (tokenizer.hasMoreTokens()) {
					if (k == 1) {
						newPIArray[k] = '.';
						k++;
						continue;
					}
					String token = tokenizer.nextToken();
					token = token.replaceAll("[^a-zA-Z ]", "");
					newPIArray[k] = intToChar(token.trim().length());
					k++;
				}

				String newPi = new String(newPIArray);

				boolean isEqual = compareTwoFloat(PI, newPi.trim());
				if (isEqual) {
					System.out.println(A_PI_SONG);
				} else {
					System.out.println(NOT_A_PI_SONG);
				}
			}
		} finally {
			scanner.close();
		}

	}

	static boolean compareTwoFloat(String a, String b) {

		String sub = a.substring(0, b.length());
		if (sub.equalsIgnoreCase(b))
			return true;
		else
			return false;
	}

	static char intToChar(int n) {
		char digit;
		switch (n) {
		case 0:
			digit = '0';
			break;
		case 1:
			digit = '1';
			break;
		case 2:
			digit = '2';
			break;
		case 3:
			digit = '3';
			break;
		case 4:
			digit = '4';
			break;
		case 5:
			digit = '5';
			break;
		case 6:
			digit = '6';
			break;
		case 7:
			digit = '7';
			break;
		case 8:
			digit = '8';
			break;
		case 9:
			digit = '9';
			break;
		default:
			digit = 'n';
		}

		return digit;
	}

	static boolean isAlpha(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
}
