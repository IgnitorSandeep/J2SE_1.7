package org.gyt.multithreading.demo01_Start_Thread_By_Extending;
class Runner extends Thread
{

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
	
}
public class App {

	public static void main(String[] args) {
		Runner runnner1 = new Runner();
		runnner1.start();
		
		Runner runnner2 = new Runner();
		runnner2.start();
	}

}
