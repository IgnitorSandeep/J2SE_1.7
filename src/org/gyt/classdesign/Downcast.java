package org.gyt.classdesign;

//Code to understand how downcast can fail
class Downcast {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		// upcast - its fine and will always succeed
		Object obj = i;
		// downcast - will it succeed? What will happen when it fails?
		String str = (String) obj;
	}
}