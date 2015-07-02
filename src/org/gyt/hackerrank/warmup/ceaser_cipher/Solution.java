package org.gyt.hackerrank.warmup.ceaser_cipher;
import java.util.Scanner;

public class Solution {

	static boolean isLowerCase(char c) {
		return (c >= 'a' && c <= 'z');
	}

	static boolean isUpperCase(char c) {
		return (c >= 'A' && c <= 'Z');
	}

	static boolean isAlpha(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int length;
		String input;
		int key;
		Scanner scanner = new Scanner(System.in);

		length = scanner.nextInt();
		input = scanner.next();
		key = scanner.nextInt();

		String cipherText = getCipther(input, key, length);
		System.out.println(cipherText);
	}

	private static String getCipther(String input, int key, int lenght) {
		String ciptherText = null;
		char cipherCharArray[] = new char[lenght];
		key %= 'z' - 'a' + 1;

		for (int i = 0; i < lenght; i++) {
			char newChar;
			char oldChar = input.charAt(i);
			if(isAlpha(oldChar)) {
				if(isLowerCase(oldChar)) {
					newChar = (char) (oldChar + key);
					if(newChar >'z') {
						newChar = (char) (newChar - 'z' + 'a' - 1);
					}
					cipherCharArray[i] = newChar;
				}
				else {
					newChar = (char) (oldChar + key);
					if(newChar >'Z') {
						newChar = (char) (newChar - 'Z' + 'A' - 1);
					}
					cipherCharArray[i] = newChar;
				}
			}
			else {
				cipherCharArray[i] = oldChar;
			}
		}
		ciptherText= new String(cipherCharArray);
		return ciptherText;
	}

}