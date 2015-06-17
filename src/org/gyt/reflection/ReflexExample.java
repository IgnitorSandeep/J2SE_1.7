package org.gyt.reflection;

public class ReflexExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Class c1 = "foo".getClass();
		System.out.println("\"foo\" class name : "+c1.getName());
		
		System.out.println("\"System.console()\" : "+System.console().getClass().getName());

	}

}
