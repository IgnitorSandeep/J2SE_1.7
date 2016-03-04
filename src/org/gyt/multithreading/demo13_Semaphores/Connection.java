package org.gyt.multithreading.demo13_Semaphores;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection connection = new Connection();
	private int connections = 0;
	private Semaphore sem = new Semaphore(10);

	private Connection() {

	}

	public static Connection getInstance() {

		return connection;
	}

	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			doConnect();
		} finally {
			sem.release();
		}
	}

	public void doConnect() {

		synchronized (this) {
			connections++;
			System.out.println("Current connection is : " + connections);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}

	}

}
