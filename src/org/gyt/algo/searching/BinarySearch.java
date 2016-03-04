package org.gyt.algo.searching;

/**
 * This class implements the binary search related methods
 * 
 * @author sandeep
 *
 */
public class BinarySearch {

	/**
	 * this method search an element in an sorted array
	 * 
	 * @param data
	 *            array of integers
	 * @param start
	 *            start index of array
	 * @param end
	 *            end index of array
	 * @param element
	 *            element to be search
	 * @return position of element if found else return -1
	 */
	public int search(int data[],int start,int end,int element){
		
		if(start==end)
		{
			if(data[start]==element)
				return start;
			else 
				return -1;
		}else{
			int mid=(start+end)/2;
			if(data[mid]==element){
				return mid;
			}
			else if(data[mid]>element)
				return search(data, start, mid-1, element);
			else
				return search(data, mid+1, end, element);
		}
	}
}
