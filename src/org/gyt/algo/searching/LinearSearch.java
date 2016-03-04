package org.gyt.algo.searching;
/**
 * This class is for linear search
 * @author sandeep
 *
 */
public class LinearSearch {
	/**
	 * this method return the position of an element in an array
	 * @param data array of integers
	 * @param start start index of array
	 * @param end  last index of array
	 * @param element element to search in array
	 * @return position of element in array else return -1,if not found
	 */
	public int search(int data[],int start,int end,int element){
		int length=end-start+1;
		for(int i=0;i<length;i++){
			if(data[i]==element)
				return i;
		}
		return -1;
	}

}
