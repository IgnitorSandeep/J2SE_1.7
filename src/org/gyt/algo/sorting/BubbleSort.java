package org.gyt.algo.sorting;

public class BubbleSort {
	
	public int[] sort(int a[],int start,int end){
		int n =end-start+1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=0;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}	
		return a;
	}
}
