package org.gyt.thread.operations;

public class MyThread implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main() , Current Thread Name is : "+Thread.currentThread().getName());
		Thread t1 =new Thread(new MyThread());
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In run(),Current Thread Name is : "+Thread.currentThread().getName());
	}

}
