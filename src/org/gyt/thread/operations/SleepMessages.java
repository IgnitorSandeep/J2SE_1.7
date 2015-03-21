package org.gyt.thread.operations;

public class SleepMessages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "sandeep","saurabh","sateesh","sivam"};
		for(int i=0;i<a.length;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Exceptio Caught :( " +e);
			}
			System.out.print(" - "+a[i]+" - ");
		}

	}

}
