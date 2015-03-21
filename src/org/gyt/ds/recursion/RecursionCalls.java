package org.gyt.ds.recursion;

public class RecursionCalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Farward Print 0-4
		recursiveFarwardPrint(0);
		//Reverse Print 4-0
		System.out.println();
		recursiveReversePrint(0);
		
	}
	static void recursiveFarwardPrint(int num) {
		  System.out.print(" "+num);
		   if (num < 4)
			   recursiveFarwardPrint(num + 1);
		}

	static void recursiveReversePrint(int num) {
		  
		   if (num < 4)
			   recursiveReversePrint(num + 1);
		   System.out.print(" "+num);
		}
}
