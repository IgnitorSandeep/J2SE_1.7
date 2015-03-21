package org.gyt.design.singleton;

import org.gyt.design.singleton.multithreading.singlelock.SingleObjectOneLock;
import org.gyt.design.singleton.multithreading.threadsafe.Singleton;
import org.gyt.design.singleton.singlethread.SingleObject;

public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject singleObject = new SingleObject();
		
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();
		SingleObjectOneLock.getInstance().doSomething();
		Singleton.getInstance().doSomething();
}
}
