package org.gyt.algo.searching;

import org.gyt.algo.sorting.QuickSort;

public class SelectionProcedure {

	public int findKthSmallest(int a[], int p, int q, int k) {

		if (p == q) {
			if (a.length==k)
				return a[p];
			else
				return -1;
		} else {

			int m = QuickSort.partition(a, p, q);
			if (m == k-1) {
				return a[m];
			} else if (k-1 < m) {
				return findKthSmallest(a, p, m - 1, k);
			} else {
				return findKthSmallest(a, m + 1, q, k);
			}
		}
	}

}
