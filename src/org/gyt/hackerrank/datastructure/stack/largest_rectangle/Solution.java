package org.gyt.hackerrank.datastructure.stack.largest_rectangle;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	/**
	 * a try for getting answer in O(n) But this is NOT CORRECT
	 * 
	 * @param histos
	 * @return
	 */

	static int maxArea(int[] histos) {
		int maxArea = -1;

		Stack<Integer> indexes = new Stack<Integer>();
		Stack<Integer> heights = new Stack<Integer>();

		for (int i = 0; i < histos.length; i++) {
			if (heights.isEmpty() || heights.peek() < histos[i]) {
				heights.push(histos[i]);
				indexes.push(i);
			} else if (histos[i] < heights.peek()) {

				int lastIndex = 0;
				while (!heights.isEmpty() && histos[i] < heights.peek()) {
					lastIndex = indexes.pop();
					int tempArea = heights.pop() * (i - lastIndex);
					if (maxArea < tempArea)
						maxArea = tempArea;
				}

				heights.push(histos[i]);
				indexes.push(i);

			}
		}

		while (!heights.isEmpty()) {
			int tempArea = heights.pop() * (histos.length - indexes.pop());
			if (tempArea > maxArea)
				maxArea = tempArea;
		}

		return maxArea;
	}

	/**
	 * Correct Implementation
	 * 
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	static int getMaxArea(int a[], int start, int end) {
		int maxArea = 0;
		int minIndex = start;
		if (start == end)
			return a[start];
		else if (end < start)
			return 0;
		else {
			for (int i = start; i < end; i++) {
				if (a[minIndex] > a[i])
					minIndex = i;
			}

			int area1 = getMaxArea(a, start, minIndex - 1);
			int area2 = getMaxArea(a, minIndex + 1, end);
			int area3 = a[minIndex] * (end - start + 1);
			maxArea = (area1 > area2) ? (area2 > area3 ? area1
					: (area1 > area3 ? area1 : area3)) : (area1 > area3 ? area2
					: (area2 > area3 ? area2 : area3));
		}

		return maxArea;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N;
		N = scanner.nextInt();

		int height[] = new int[N];

		for (int i = 0; i < N; i++)
			height[i] = scanner.nextInt();

		// System.out.println(maxArea(height));
		System.out.println(getMaxArea(height, 0, height.length - 1));

		scanner.close();
	}
}