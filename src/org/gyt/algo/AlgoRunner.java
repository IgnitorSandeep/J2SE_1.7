package org.gyt.algo;

import java.util.Arrays;

import org.gyt.algo.sorting.MergeSort;

/**
 * This is Main Class for running algorithms
 * 
 * @author sandeep
 *
 */
public class AlgoRunner {

	public static void main(String[] args) {

		int a[] = {8, 6, 3, 11, 1, 14, 112, 0};

		// Merge Sorting
		MergeSort ms = new MergeSort();
		long start  = System.nanoTime();
		ms.merge_sort(a, 0, a.length - 1);
		long end = System.nanoTime();
		System.out.println("Merge Sort Output:");
		System.out.println(Arrays.toString(a));
		System.out.println("Total time for execution is " + (end - start) + "\n");
		
//		// Bubble Sorting
//		int a1[] = { 2, 32, 33, 5, 6, 8, 4, 443, 546, 7654, 645, 3453, 76, 454, 65, 556, 456, 6547, 456, 1232 };
//		BubbleSort bs = new BubbleSort();
//		start = System.nanoTime();
//		int bsArray[] = bs.sort(a1, 0, a1.length - 1);
//		end = System.nanoTime();
//		System.out.println("Bubble Sort Output:");
//		System.out.println(Arrays.toString(bsArray));
//		System.out.println("Total time for execution is " + (end - start) + "\n");
//
//		// Quick Sorting
//		int a2[] = { 2, 32, 33, 5, 6, 8, 4, 443, 546, 7654, 645, 3453, 76, 454, 65, 556, 456, 6547, 456, 1232 };
//		QuickSort qs = new QuickSort();
//		start = System.nanoTime();
//		int qsArray[] = qs.sort(a2, 0, a2.length - 1);
//		end = System.nanoTime();
//		System.out.println("Quick Sort Output:");
//		System.out.println(Arrays.toString(qsArray));
//		System.out.println("Total time for execution is " + (end - start) + "\n");
//
//		// Insertion Sorting
//		int a3[] = { 2, 32, 33, 5, 6, 8, 4, 443, 546, 7654, 645, 3453, 76, 454, 65, 556, 456, 6547, 456, 1232 };
//		InsertionSort is = new InsertionSort();
//		start = System.nanoTime();
//		int isArray[] = is.sort(a3, 0, a3.length - 1);
//		end = System.nanoTime();
//		System.out.println("Insertion Sort Output:");
//		System.out.println(Arrays.toString(isArray));
//		System.out.println("Total time for execution is " + (end - start) + "\n");
//
//		// Linear Searching
//		LinearSearch ls = new LinearSearch();
//		start = System.nanoTime();
//		int lsPos = ls.search(msArray, 0, msArray.length - 1, 8);
//		end = System.nanoTime();
//		System.out.println("Linear Search Output:");
//		System.out.println("Position of element in array is " + lsPos);
//		System.out.println("Total time for execution is " + (end - start) + "\n");
//
//		// Binary Searching
//		BinarySearch bs1 = new BinarySearch();
//		start = System.nanoTime();
//		int bsPos = bs1.search(msArray, 0, msArray.length - 1, 8);
//		end = System.nanoTime();
//		System.out.println("Binary Search Output:");
//		System.out.println("Position of element in array is " + bsPos);
//		System.out.println("Total time for execution is " + (end - start) + "\n");
//
//		// Selection Procedure
//		SelectionProcedure sp = new SelectionProcedure();
//		int k = 7;
//		start = System.nanoTime();
//		int elem = sp.findKthSmallest(a, 0, a.length - 1, k);
//		end = System.nanoTime();
//		System.out.println("Selection Proceure Output:");
//		System.out.println(k + "th smallest element is " + elem + "\n");

	}

}
