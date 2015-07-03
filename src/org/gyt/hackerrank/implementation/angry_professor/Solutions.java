package org.gyt.hackerrank.implementation.angry_professor;

import java.util.Scanner;

public class Solutions {

	public static void main(String[] args) {
		int tcCount;
		Scanner scanner = new Scanner(System.in);
		tcCount = scanner.nextInt();
		//String sol
		for (int i = 0; i < tcCount; i++) {
			int N, K;
			N = scanner.nextInt();
			K = scanner.nextInt();
			int onTimeReachedCount = 0;
			for (int j = 0; j < N; j++) {
				if (scanner.nextInt() <= 0) {
					onTimeReachedCount++;
				}
			}
			if (onTimeReachedCount < K) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}