package org.gyt.algo.sorting;

public class MergeSort {

	public static void merge(int data[], int start, int mid, int end) {

		int l_len = mid - start + 1;
		int r_len = end - mid;

		int l_array[] = new int[l_len + 1];
		int r_array[] = new int[r_len + 1];

		// Adding infinity as a last element for new arrays
		l_array[l_len] = Integer.MAX_VALUE;
		r_array[r_len] = Integer.MAX_VALUE;

		// Copying first half array into the l_array
		for (int i = 0; i < l_len; i++) {
			l_array[i] = data[start + i];
		}

		// Copying the second half array into the r_array
		for (int j = 0; j < r_len; j++) {
			r_array[j] = data[mid + j + 1];
		}

		// l and r keep tracks of cells merged from the smaller arrays l_array
		// and r_array
		int l = 0;
		int r = 0;

		// Now merging elements of both l_array[] and r_array[] into the data[]
		for (int k = start; k <= end ; k++) {
			if (l_array[l] <= r_array[r]) {
				data[k] = l_array[l++];
			} else {
				data[k] = r_array[r++];
			}
		}
	}

	public void merge_sort(int data[], int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			merge_sort(data, start, mid);
			merge_sort(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}

	public static String printArray(int data[], int start, int end) {
		String str = "[ ";
		for (int i = start; i < end; i++) {
			str = str + data[i] + ", ";
		}
		str = str + data[end] + " ]";
		return str;
	}

}
