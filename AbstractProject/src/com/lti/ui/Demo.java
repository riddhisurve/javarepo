package com.lti.ui;
import com.lti.bean.*;

public class Demo {
	public static void main(String[] args) {
		//Account myAccount = new Account();
		Account myAccount = new SavingAccount(100,"Riddhi",50000);
		System.out.println(myAccount); //toString is invoked
		myAccount.withdraw(10000.00);
	}
}
