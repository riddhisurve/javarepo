package com.lti.bean;

public class SavingAccount extends Account{
	private double interest;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(int accno, String holder, double balance) {
		super(accno,holder,balance);
		this.interest=super.getBalance()*0.04;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Interest = " + interest;
	}
	
	@Override
	public void withdraw(double amount) {
		double currentBalance=super.getBalance();
		currentBalance-=amount;
		super.setBalance(currentBalance);
		//super.setBalance(super.getBalance()-amount);
		System.out.println("After withdraw balance is "+super.getBalance());
	}
	
}
