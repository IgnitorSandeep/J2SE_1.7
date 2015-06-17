package org.gyt.reflection;

public class ReflectionDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Class c = null;
		
		c = Thread.State.class.getEnclosingClass();
		System.out.println("Enclosing class of \"java.lang.Thread.State\" is : "+c.getName());

	}

}
