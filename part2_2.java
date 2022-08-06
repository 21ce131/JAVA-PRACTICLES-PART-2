/*ID: 21CE131
Name: RISHI SHAH
AIM : Design a class named Account that contains:
	 •A private int data field namedid for the account (default 0).
	 •A private double data field named balance for the account (default 500₹).
	 •A  private  double  data  field  named  annualInterestRate  that  stores  
	  the  currentinterest rate (default 7%).
	  Assume all accounts have the same interest rate.
	 •A  private  Date  data  field  named  dateCreated  that  stores  the  
	  date  when  theaccount was created.
	 •A no-arg constructor that creates a default account.
	 •A constructor that creates an account with the specified id and initial 
	  balance.
	 •The accessor and mutator methods for id, balance, and annualInterestRate.
	 •The accessor method for dateCreated.
	 •A method named getMonthlyInterestRate() that returns the monthlyinterest 
	  rate.
	 •A method named getMonthlyInterest() that returns the monthly interest.
	 •A method named withdraw that withdraws a specified amount from theaccount.
	 •A method named deposit that deposits aspecified amount to the account.*/
import java.util.*;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private String datecreated;
	Scanner sc = new Scanner(System.in);
	Account(){
		id=0;
		balance=500;
		annualInterestRate=7;
		datecreated = "23/10/2015";
	}
	Account(int a,double b){
		id=a;
		balance=b;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDatecreated() {
		return datecreated;
	}
	
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	public void withdraw(double wd){
		balance = balance-wd;
	}
	public void deposit(double de){
		balance = balance+de;
	}
}

public class Part2_2 {	
	public static void main(String[] args) {
		
		Account Ac = new Account(114, 20000);
		Ac.setAnnualInterestRate(7.5);
		Ac.withdraw(5000);
		Ac.deposit(3000);
		Ac.setDatecreated("23/10/2015");
		
		System.out.println("Balance: "+Ac.getBalance());
		System.out.println("Monthly Interest: "+Ac.getMonthlyInterest());
		System.out.println("Date Created: "+Ac.getDatecreated());

	}

}
