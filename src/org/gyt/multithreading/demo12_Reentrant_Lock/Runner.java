package org.gyt.multithreading.demo12_Reentrant_Lock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	public void increment() {
		for (int i = 0; i < 10000; i++)
			count++;
	}

	public void firstThread() throws InterruptedException {
		lock.lock();

		System.out.println("Waiting...");
		cond.await();
		System.out.println("Woken up...");

		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();

		System.out.println("Press a return key!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();
		System.out.println("Return Key pressed!");
		cond.signal();

		try {
			increment();
		} finally {
			lock.unlock();
		}

	}

	public void finished() {
		System.out.println("Count is : " + count);
	}

}
