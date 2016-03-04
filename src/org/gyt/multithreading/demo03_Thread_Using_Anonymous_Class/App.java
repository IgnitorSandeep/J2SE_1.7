package org.gyt.multithreading.demo03_Thread_Using_Anonymous_Class;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Hello "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		} );

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Hello "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		} );
		t1.start();
		t2.start();
	}

}