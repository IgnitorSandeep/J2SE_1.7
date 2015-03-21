package org.gyt.string;

public class StringDeclarations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(10); // right way to convert from an
											// integer to String

		//String str2 = 10; // compiler error—cannot convert from int to String
		//String str3 = (String) 10; // compiler error—cannot convert from int to
									// String
		/// i = "10"; // compiler error—cannot convert from String to int
		//int i = (int) "10"; // compiler error—cannot convert from String to int
		
		int i1 = Integer.parseInt("10"); // right way to convert from a String to an int
		float f = Float.parseFloat("no such value");

	}

}
