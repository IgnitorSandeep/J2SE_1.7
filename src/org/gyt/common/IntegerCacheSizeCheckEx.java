package org.gyt.common;
class IntegerCacheSizeCheckEx{

	public static void main(String args[]){
		Integer c = 200;
		Integer d = 200;
		Integer a = 100;
		Integer b = 100; 
		//		System.out.println("A:"+a.getClass().getCanonicalName());
		//		System.out.println("B:"+b.getClass().getCanonicalName())
System.out.println(a==b);

		//		System.out.println("C:"+c.getClass().getCanonicalName());
		//		System.out.println("D:"+d.getClass().getCanonicalName());
		System.out.println(c==d);
	}

}