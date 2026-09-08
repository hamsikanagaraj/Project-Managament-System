package com.mit.bank;
public class Accounts {
	private double balance;
	
	public Accounts(double balance) {
		this.balance=balance;
	}
		
	public double getBalance() {
			return this.balance;
			
		}
	public double deposit(double amount) {
		balance+= amount;
		return balance;
	}
	public double withdraw(double amount) throws BalanceException {
		if(amount<= balance)
			balance-=amount;
		else
			throw new BalanceException("Insufficient balance!");
		return balance;
	}
	public static void main(String[] args) {
		Accounts a1=new Accounts(1000);
		//System.out.println(a1.getBalance());
		
		//System.out.println("After deposit of 500," + a1.deposit(500));
		//System.out.println("After withdrawal of 800," + a1.deposit(800));
		
		try {
			a1.withdraw(2000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


