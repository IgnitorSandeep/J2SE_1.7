package org.gyt.algo.sorting;
/**
 * This class provide methods for quick sort.
 * @author sandeep
 *
 */
public class QuickSort {

	public static int partition(int a[], int start, int end) {

		int i = start;
		int pivote = a[start];
		for (int j = start + 1; j <= end; j++) {
			if (a[j] <= pivote) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i];
		a[i] = a[start];
		a[start] = temp;
		
		return i;

	}

	public int[] sort(int a[], int start, int end) {

		if (start == end) {
			return a;
		} else {
			if (start < end) {
				int m = partition(a, start, end);
				sort(a, start, m - 1);
				sort(a, m + 1, end);
			}
		}

		return a;
	}

}
