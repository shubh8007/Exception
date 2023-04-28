package com.Exception;

import java.util.Scanner;

public class TesterAccount {

	public static void main(String[] args) throws LowBalanceException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account details..");
		System.out.println("Accno name city balance");
		Account ac=new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
	System.out.println(ac);
ac.Withdraw();
	/*try {
		ac.Withdraw();
	}catch(LowBalanceException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();*/
	}
	}
	
	


