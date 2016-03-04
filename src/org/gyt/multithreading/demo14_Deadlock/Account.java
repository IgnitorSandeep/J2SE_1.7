package org.gyt.multithreading.demo14_Deadlock;

public class Account {
	private int balance = 10000;
	
	public void deposite(int ammount) {
		balance += ammount;
	}
	
	public void withdrawl(int ammount) {
		balance -= ammount;		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void transfer(Account acc1,Account acc2,int ammout) {
		acc1.withdrawl(ammout);
		acc2.deposite(ammout);
	}

}
