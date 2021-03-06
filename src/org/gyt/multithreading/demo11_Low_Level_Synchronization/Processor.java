package org.gyt.multithreading.demo11_Low_Level_Synchronization;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();
	
	public void producer() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized (lock) {
				while(list.size() == LIMIT)
					lock.wait();
				list.add(value++);
			}
		}
	}
	
	public void consumer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			synchronized (lock) {
				System.out.print("Linked List Size is : "+list.size());
				int value = list.removeFirst();
				System.out.println(" ; value is : "+value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));
		}
	}
	
}
