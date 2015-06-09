package org.gyt.string;

public class StringDeclarations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//String str1 = String.valueOf(10); // right way to convert from an
											// integer to String

		//String str2 = 10; // compiler error—cannot convert from int to String
		//String str3 = (String) 10; // compiler error—cannot convert from int to
									// String
		/// i = "10"; // compiler error—cannot convert from String to int
		//int i = (int) "10"; // compiler error—cannot convert from String to int
		
		//int i1 = Integer.parseInt("10"); // right way to convert from a String to an int
		//float f = Float.parseFloat("no such value");
		String a ="Hello";
		System.out.println(a);
		System.out.println(a.hashCode());
		String b = "Hello";
		System.out.println(b);
		System.out.println(b.hashCode());
		if(a==b)
		{
			System.out.println("a and b are equal.");
		}else
		{
			System.out.println("a and b are not equal.");
		}
		

	}

}
