package org.gyt.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RailwayStation {

	private static Lock station = new ReentrantLock();
	private static Condition sandeepArriaval = station.newCondition();

	static class Train extends Thread {
		
		public Train(String name){
			this.setName(name);
		}

		public void run() {
				station.lock();
				try {
					System.out.println(getName()+" : I've arrived in station ");
					if(getName().startsWith("12555")){
						sandeepArriaval.signalAll();
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				finally{
					station.unlock();
				}
		}

	}
	
	static class WaitForSandeep extends Thread{
		public void run(){
			System.out.println("Person 1 : Waiting at station for 12555 in which Sandeep is coming. ");
			station.lock();
			try{
				sandeepArriaval.await();
				System.out.println("Person 1 : Pick up Sandeep and go home");
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				station.unlock();
				
			}
		}
	}
	
	public static void main(String args[]) {
		
		new WaitForSandeep().start();
		new Train("12555-Gorakhadham Express").start();
		new Train("12223-Sapt Kranti Superfast").start();
		new Train("22222-Duranto Express").start();
		new Train("99090-Example Express").start();
		new Train("932090-Shiv Ganga Express").start();
		new Train("912190-Garib Rath Express").start();
		
	}

}
