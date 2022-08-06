/*ID : 21CE131
  NAME : RISHI SHAH
  AIM : Write a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.*/

import java.util.*;
import java.lang.*;
	

	class account{
		int accountno;
	    double balance;
	    double annualInterestRate;
	    String date;
	

	    public void get(int accountno, double balance, double annualInterestRate,String date)
	    {
	        this.accountno = accountno;
	        this.balance = balance;
	        this.annualInterestRate = annualInterestRate;
	        this.date = date;
	    }
	   
	    public double InterestRate(){
	        return this.annualInterestRate;
	    }
	   
	    double balance(){
	        return this.balance;
	    }
	   
	    double deposite(double i)
	    {
	        balance = balance + i;
	        return balance;
	    }
	   
	    double withdrawl(double w)
	    {
	        balance = balance - w;
	        return balance;
	    }
	

	    double getMonthlyInterest()
	    {
	        return annualInterestRate * balance;
	    }
	

	    public String toString(){//overriding the toString() method  
	        return  this.balance + "\nbalance -  " + balance + "\naccoutno - " + this.accountno + "\nAnnualInterestRate - " + this.annualInterestRate + "\nDate - " + date;
	    }
	

	}
	class savingaccount extends account{
	    savingaccount(int accountno, double balance, double annualInterestRate,String date)
	    {
	        this.accountno = accountno;
	        this.balance = balance;
	        this.annualInterestRate = annualInterestRate;
	        this.date = date;
	    }
		
		double withdrawl(double w)
	    {
			// System.out.println("Your current balance "+ balance);
			double t = balance - w;
			if(t < 0)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("You can use the overdraft facility to withdraw more money");
				System.out.println("Press 1 to take overdraft facility \nPress 2 to exit");
				int n = sc.nextInt();
				switch(n){
					case 1:
					System.out.println("You can withdaw money upto 10000");
					balance = 10000;
					balance = balance - w;
					return balance;
					case 2:
					break;
				}
			}
			else if((balance = balance - w)>0)
	        {
	            return balance;
	        }
	        return balance;
	    }
	}
	class checkingaccount extends account{
	

	    checkingaccount(int accountno, double balance, double annualInterestRate, String date)
	    {
	        this.accountno = accountno;
	        this.balance = balance;
	        this.annualInterestRate = annualInterestRate;
	        this.date = date;
	    }
		
		double withdraw(double w)
		{
			balance = balance - w;
			if(balance < 0)
			{
				System.out.println("You balance is zero you cannot withdraw more money");
			}
	

			return balance;	
		}
	}
	

	class Main{
	public static void main(String[] args){
	account a = new account();
	savingaccount s = new savingaccount(2,500,2.3,"10/11/22");
	checkingaccount c = new checkingaccount(2,500,2.3,"10/11/22");
	

	s.withdrawl(600);
	System.out.println(s);
	System.out.println(a);
	System.out.println(s);
	
	}
	}



