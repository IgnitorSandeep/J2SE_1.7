package org.gyt.concurrency.fork;

public class SumOfNUsingDirectFormula {
	
	private static long N = 1000_000; // one million - we want to compute sum
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		long result = ((N*(N+1))/2);
		long end = System.nanoTime();
		System.out.println("Sum of 1000_000 is : "+result);
		System.out.println("Time taken is sum is :"+(end -start));

	}

}
