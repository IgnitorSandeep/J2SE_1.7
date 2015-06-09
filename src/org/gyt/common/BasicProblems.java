package org.gyt.common;

import java.math.BigInteger;

public class BasicProblems {

	static int  getFactorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}

		return fact;
	}

	int recFactorials(int num)
	{
		if(num<=0)
		{
			return 1;
		}else{

			return num*recFactorials(num -1);
		}
	}
	public static BigInteger  getFactorial(BigInteger num)
	{
		BigInteger result = BigInteger.ONE;

		while(!num.equals(BigInteger.ZERO))
		{
			result = result.multiply(num);
			num = num.subtract(BigInteger.ONE);
		}

		return result;
	}

	static  String checkEvenOrOdd(int num)
	{
		String result = num%2==0?"Even" : "Odd" ;
		return result;
	}

	@WrongImplementation
	static void swapUsingTempVar(Object a ,Object b)
	{
		Object temp ;
		System.out.println("Using Temp Variable");
		System.out.println("Before Swap : a ="+a+",b ="+b );
		temp = a ;
		a = b;
		b = temp;
		System.out.println("After Swap  : a ="+a+",b ="+b );
		System.out.println();
	}

	@WrongImplementation
	static void swapUsingBitwiseOperator(int i ,int j)
	{
		System.out.println("Using Operators");
		System.out.println("Before Swap : i ="+i+",j ="+j );
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		System.out.println("After Swap  : i ="+i+",j ="+j );
		System.out.println();
	}

	static int findGreatest(int a,int b,int c){
		if((a>=b)&&(a>=c)){
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else if(c>=a&&c>=b)
		{
			return c;
		}
		return -1;
	}

	static int findGreatest(int arr[])
	{
		int greatest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>greatest){
				greatest = arr[i];
			}
		}

		return greatest;
	}
	static void printPrime(int start , int end) throws Exception
	{
		if(end<start)
		{
			throw new Exception("Chutiye Ho ka :P");
		}
		System.out.println("List of prime numbers between " + start + " and " + end);
		for(int i =start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}

	//Time complexity is O(n)
	static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		int i;
		for( i =2;i<num-1;i++)
		{
			if(num %i == 0){
				return false;
			}
		}
		if(num == i)
			return true;
		return false;
	}


	//Time complexity is O(n/2)
	static boolean isPrime1(int num)
	{
		if(num<=1)
		{
			return false;
		}
		int i;
		for( i =2;i<=num/2;i++)
		{
			if(num %i == 0){
				return false;
			}
		}
		return true;
	}

	//Time complexity is O(sqrt(n))
	static boolean isPrimeSqrt(int num)
	{
		if(num<=1)
		{
			return false;
		}
		int i;
		for( i =2;i<=Math.sqrt(num);i++)
		{
			if(num %i == 0){
				return false;
			}
		}
		return true;
	}
	static int findReverse(int num)
	{
		int reverse = 0;

		while(num != 0)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse;
	}
	
	static boolean isPalindrome(int num)
	{
		int reverse = findReverse(num);
		
		if(num==reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static void generateFibonnaci()
	{
		int first =0;
		int second = 1;
		int fibbo;
		
		for(int j = 0; j<10; j++)
		{
			if(j==0)
			{
				System.out.print(first+" ");
			}
			else if(j==1)
			{
				System.out.print(second+" ");
			}
			else 
			{
				fibbo = first + second ;
				first = second;
				second = fibbo;
				System.out.print(fibbo+" ");
			}
		}
	}

	public static void main(String[] args) {

		//Factorial for BigInteger values
		System.out.println("Factorial of 5  : "+getFactorial(BigInteger.valueOf(5))+"\n");

		//Factorials for int values
		System.out.println("Factorial of 5  : "+getFactorial(5)+"\n");

		//Factorials for int values using recursion
		System.out.println("Factorial of 5  : "+new BasicProblems().recFactorials(5)+"\n");

		//Given No is Even of odd
		System.out.println("5 is "+checkEvenOrOdd(5)+"\n");

		//Swapping two number
		Integer a =5;
		Integer b =7;
		swapUsingTempVar(a, b);

		//Again Swap
		swapUsingTempVar(a, b);

		//Find Greates among three numbers
		System.out.println("Greated among 1,2,3 : "+findGreatest(1, 2, 3));
		System.out.println();

		//Find greates in array
		int arr[] = {1,2,2,3,4,5,7,7,8,91,111,43};
		System.out.println("Greatest number in the given array is : "+findGreatest(arr));
		System.out.println();

		//Check number is prime or not
		System.out.println("5 is prime  : "+isPrime(5));
		System.out.println("2 is prime  : "+isPrime(2));


		//Check number is prime or not
	
		System.out.println("4 is prime  : "+isPrime1(4));
		System.out.println("7 is prime  : "+isPrime1(7));

		//Check number is prime or not
		System.out.println("4 is prime  : "+isPrimeSqrt(4));
		System.out.println("7 is prime  : "+isPrimeSqrt(7));
		
		//Check for a number is palindrome or not
		System.out.println();
		System.out.println("121 is palindrome or not : "+isPalindrome(121));
		System.out.println("122 is palindrome or not : "+isPalindrome(122));

		//Generating Fibbonacci Series
		generateFibonnaci();
	}

}
