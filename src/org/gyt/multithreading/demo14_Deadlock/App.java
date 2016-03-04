package org.gyt.multithreading.demo14_Deadlock;

public class App {

	public static void main(String[] args) {
		final Runner runner = new Runner();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.firstThread();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.firstThread();
			}
		});
		t2.start();	
		t1.start();

		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		runner.finished();
	}

}
