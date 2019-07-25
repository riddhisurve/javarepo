package com.lti.bean;

public abstract class Account {
	private int accno;
	private String holder;
	private double balance;
	
	public Account() {
		//TODO Auto-generated constructor stub
	}
	
	public Account(int accno, String holder, double balance) {
		super();
		this.accno = accno;
		this.holder = holder;
		this.balance = balance;
	}
	
	public int getAccno() {
		return accno;
	}
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
	public abstract void withdraw(double amount) ;
	
}
