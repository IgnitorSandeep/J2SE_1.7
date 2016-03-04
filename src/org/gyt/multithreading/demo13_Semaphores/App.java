package org.gyt.multithreading.demo13_Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executer = Executors.newCachedThreadPool();
		for (int i = 0; i < 200; i++) {
			executer.submit(new Runnable() {
				
				@Override
				public void run() {
					Connection.getInstance().connect();					
				}
			});
		}
		executer.shutdown();
		executer.awaitTermination(1, TimeUnit.DAYS);
	}

}
