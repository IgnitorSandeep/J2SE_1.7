package org.gyt.algo.sorting;


public class InsertionSort {

	public int[] sort(int arr[],int start,int end){

		for(int i=start+1;i<arr.length;i++){
			for(int j=i;j>start;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

}
