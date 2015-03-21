package org.gyt.thread.problems.datarace;

//This class exposes a publicly accessible counter
//to help demonstrate data race problem
class CounterProb {
	public static long count = 0;
}

// This class implements Runnable interface
// Its run method increments the counter three times
class UseCounterProb implements Runnable {
	public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		CounterProb.count++;
		System.out.print(CounterProb.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

// This class creates three threads
public class DataRaceProb {
	public static void main(String args[]) {
		UseCounterProb c = new UseCounterProb();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}