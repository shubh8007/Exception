package com.Exception;

import java.util.Scanner;

public class Account {
private int accno;
private String name;
private String city;
private double balance;


public Account(int accno,String name,String city,double balance) {
	this.accno=accno;
	this.name=name;
	this.city=city;
	this.balance=balance;
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public int getAccno() {
	return accno;
}


public double getBalance() {
	return balance;
}
public String toString() {
	return " Accno= "+accno+" name="+name+" city="+city+" Balance="+balance;
	
}



public void  Withdraw() throws LowBalanceException{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Amount to withdraw..");
	double amt=sc.nextDouble();
	
	if(balance>amt) {
		balance=balance-amt;
		System.out.println(balance);
		//System.out.println(getBalance());
	}
	else {
		throw new LowBalanceException("Sorry you have Insufficient Balance");
	
	}
	}	

}



