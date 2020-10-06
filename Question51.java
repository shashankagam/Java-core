package com.assignments_2;

import java.util.Scanner;

class Bank{
	static int acc = 10000;
	String accno;
	String name;
	double balance;
	String branch;
	static double totalMoney;
	
	Bank(){
	
	}
	
	Bank(char type, String name, double balance, String branch){
		acc++;
		this.accno = type + "" + acc;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		totalMoney += balance;
	}
	
	void withdraw(double amt) {
		double minBal = 0;
		if(this.accno.charAt(0) == 'C') {
			minBal = 1000;
		}
		else if(this.accno.charAt(0) == 'S') {
			minBal = 5000;
		}
		double temp = this.balance - amt;
		if(temp > minBal) {
			this.balance = temp;
			totalMoney-=temp;
			System.out.println("Updated Details : ");
			System.out.println(this.toString());
		}
		else
			System.out.println("Insufficient Funds!");
	}
	
	void deposit(double amt) {
		this.balance += amt;
		totalMoney+=amt;
		System.out.println("Updated Details : ");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}
	
}

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Bank b[] = new Bank[1];
		
		for(int i=0; i<b.length; i++) {
			System.out.println("Enter the Account Type (C/S) : ");
			char acctype = sc.next().charAt(0);
			acctype = Character.toUpperCase(acctype);
			System.out.println("Enter your name : ");
			String name = sc.next();
			System.out.println("Enter Balance : ");
			double bal = sc.nextDouble();
			if((acctype == 'C' || acctype == 'c') && bal <1000) {
				System.out.println("Minimum Balance should be 1000 for Current Account!");
				i--;
				continue;
			}
			if((acctype == 'S' || acctype == 's') && bal <5000) {
				System.out.println("Minimum Balance should be 5000 for Savings Account!");
				i--;
				continue;
			}
			System.out.println("Enter the branch : ");
			String branch = sc.next();
			
			Bank temp = new Bank(acctype, name, bal, branch);
			b[i] = temp;
			System.out.println("Account created with Account Number : "+temp.accno);
		}
		
		while(true) {
			int flag = 0;
			int i=0;
			System.out.println("Enter your Account Number : ");
			String query = sc.next();
			if(query.toLowerCase().equals("exit")) {
				System.exit(0);
			}
				
			for(i=0; i < b.length; i++) {
				if(b[i].accno.equals(query)) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Invalid Account Number. Please try again!");
				continue;
			}
			System.out.println("1. Display Account Details \n2. Withdraw Cash \n3. Deposit Cash");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(b[i]);
				break;
			
			case 2:
				System.out.println("Enter the Amount you want to Withdraw : ");
				double amt = sc.nextDouble();
				b[i].withdraw(amt);
				break;
				
			case 3:
				System.out.println("Enter the Amount you want to Deposit : ");
				double damt = sc.nextDouble();
				b[i].deposit(damt);
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default :
				System.out.println("Invalid Choice! Please try again.");
			}	
		}
		
	}

}

