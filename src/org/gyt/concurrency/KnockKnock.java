package org.gyt.concurrency;

import java.util.concurrent.Exchanger;

class CoffeShopThread extends Thread {

	private Exchanger<String> sillyTalk;

	public CoffeShopThread(Exchanger<String> args) {
		sillyTalk = args;
	}

	public void run() {
		

		String reply = null;
		try {
			reply = sillyTalk.exchange("Knox! Knox!");
			System.out.println("Coffe Shop : " + reply);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			reply = sillyTalk.exchange("Duke");
			System.out.println("Coffe Shop : " + reply);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class DukeThread extends Thread {

	private Exchanger<String> sillyTalk;

	public DukeThread(Exchanger<String> args) {

		sillyTalk = args;
	}

	public void run() {
		
		String reply = null;
		
		try {
			reply = sillyTalk.exchange("Who is there?");
			
			System.out.print("Coffe Shop : "+reply);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// an exchange could happen only when both send and receive happens
		// since this is the last sentence to speak, we close the chat by
		// ignoring the "dummy" reply
		try {
			reply = sillyTalk.exchange("The one who was born in this coffee shop!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

public class KnockKnock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Exchanger<String> sillyTalk = new Exchanger<String>();
		new CoffeShopThread(sillyTalk).start();
		new DukeThread(sillyTalk).start();
	}

}
