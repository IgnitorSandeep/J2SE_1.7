package org.gyt.thread;

public class AsyncThread extends Thread {

	@Override
	public void run()
	{
		System.out.println("Starting the thread : "+Thread.currentThread().getName());
		for (int i=0;i<4;i++)
		{
			System.out.println("Current Iteration is : "+(i+1) + ", Current thread name is : "+Thread.currentThread().getName());
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AsyncThread at1=new AsyncThread();
		AsyncThread at2=new AsyncThread();
		//starting both the thread at the same time.
		at1.start();
		at2.start();

		
	}

}
