package org.gyt.thread.operations;

public class HelloThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloThread t1 = new HelloThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In main() method, Current Thread Name : " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("In run() method, Current Thread Name : " + Thread.currentThread().getName());
	}
}
