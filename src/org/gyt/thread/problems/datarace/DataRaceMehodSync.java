package org.gyt.thread.problems.datarace;

// This class exposes a publicly accessible counter
// to help demonstrate data race problem
class CounterMehodSync {
	public static long count = 0;
}

// This class implements Runnable interface
// Its run method increments the counter three times
class UseCounterMehodSync implements Runnable {

	public synchronized void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
			CounterMehodSync.count++;
			System.out.print(CounterMehodSync.count + " ");

	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

// This class creates three threads
public class DataRaceMehodSync {
	public static void main(String args[]) {
		UseCounterMehodSync c = new UseCounterMehodSync();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}