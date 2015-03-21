package org.gyt.design.singleton.multithreading.singlelock;

import org.gyt.design.singleton.singlethread.SingleObject;

/*
 * This class's instance can be created only once.
 */
public class SingleObjectOneLock {

	private static SingleObjectOneLock singleObject;

	// Default constructor has private accessibility so it's instance can't be
	// create outside of this class.
	private SingleObjectOneLock() {
	}
	
	public synchronized static SingleObjectOneLock getInstance(){
		
		if(singleObject == null){
			singleObject = new SingleObjectOneLock();
		}
		
		return singleObject;
	}
	//put your singleton business logic here.
	public void doSomething(){
		
		System.out.println("Hi,You got the single locked Singleton Object.");
		singleObject = null;
	}

}
