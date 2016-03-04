package org.gyt.multithreading.demo07_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable {

	private int id;

	public Worker(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("[Thread : " + Thread.currentThread().getId()
				+ "]" + " Starting  : " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[Thread : " + Thread.currentThread().getId()
				+ "]" + " Completed : " + id);
	}

}

public class App {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 6; i++) {
			executor.submit(new Worker(i));
		}
		executor.shutdown();
		System.out.println("All task submitted.");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("All task completed.");
		System.out.println("Time taken : "+(end-start)/1000);
	}

}
