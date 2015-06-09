package org.gyt.common;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.next());
        String arr[]=new String[T];
        for(int i =0 ;i<T;i++){
        	arr[i]=sc.next();
        }
        for(int i =0 ;i<T;i++){
        	isFitted(arr[i]);
        }
    }
    static void isFitted(String num)
    {
        try{
            long number = Long.parseLong(num);
    	    if(number>=Byte.MIN_VALUE && number<=Byte.MAX_VALUE)
    	    {              
    		   System.out.println(num +" can be fitted in:");
    		   System.out.println("* byte");
    		   System.out.println("* short");
    		   System.out.println("* int");
    		   System.out.println("* long");
    	    }
    	    else if(number>=Short.MIN_VALUE && number<=Short.MAX_VALUE)
    	    {
    		  System.out.println(num +" can be fitted in:");
    		  System.out.println("* short");
    		  System.out.println("* int");
    		  System.out.println("* long");
    		
    	    }
    	    else if(number>=Integer.MIN_VALUE && number<=Integer.MAX_VALUE)
    	    {
    		  System.out.println(num +" can be fitted in:");
    	       	System.out.println("* int");
    	       	System.out.println("* long");
    	    }
    	    else if(number >=Long.MIN_VALUE && number < Long.MAX_VALUE)
    	    {
    	       	System.out.println(num +" can be fitted in:");
    	       	System.out.println("* long");
    	    }
        }
        catch(Exception e){
     
           System.out.println(num+" can't be fitted anywhere.");
        }
       
    }
}