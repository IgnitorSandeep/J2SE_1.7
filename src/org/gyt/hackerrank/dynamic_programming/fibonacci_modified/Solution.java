package org.gyt.hackerrank.dynamic_programming.fibonacci_modified;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
   
		static String solution[] =new String[20];
	
	public static String getNthFibbo(int a,int b,int n) {
		if(solution[n-1]!=null)
			return solution[n-1];
		else
		{
			if(n-1==0)
				return ""+a;
			else if(n-1==1)
				return ""+b;
			else
			{
				String n1 = getNthFibbo( a, b, n-1);
				String n2 = getNthFibbo( a, b, n-2);
				BigInteger bn1 = new BigInteger(n1);
				BigInteger bn2 = new BigInteger(n2);
				bn1 = bn1.multiply(bn1);
				bn1 = bn1.add(bn2);
				solution[n-1] =  bn1.toString();
				return solution[n-1];
			}
		}
	}
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		System.out.println(getNthFibbo(a,b,n));
		
	}
}