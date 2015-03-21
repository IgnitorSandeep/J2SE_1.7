package org.gyt.classdesign;

public class InconvertibleType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		Object obj = new StringBuffer("Hello World");
		String str2 = (String)obj;
		// It will lead to compilation time error of Inconvertible Type Casting
		//String str3 = (String)new StringBuffer("Sandeep Singh");
	}

}
