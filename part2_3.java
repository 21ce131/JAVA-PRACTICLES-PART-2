/*ID: 21CE131
Name: Rishi Shah
AIM :Use the Account class created as above to simulate an ATM machine. 
	 Create 10 accounts  with id AC001.....AC010  with  initial balance 300₹. 
	 The system prompts the users to enter an id. 
	 If the id is entered incorrectly, ask the  user  to  enter  a  correct  id.  
	 Once  an  id  is  accepted,  display  menu  with multiple choices. 
	 1.Balance inquiry
	 2.Withdraw money [Maintain minimum balance 300₹]
	 3.Deposit money4.Money Transfer5.
	 Create Account
	 6.Deactivate Account
	 7.Exit */

import java.util.Scanner;

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private String datecreated;
	Account(){
		id=0;
		balance=500;
		annualInterestRate=7;
		datecreated = "20/10/2003";
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


public class Part2_3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Account[] acc = new Account[10];
		
		for(int i=0;i<10;i++) {
			acc[i]=new Account(i+1, 300);
		}
		System.out.println("Enter an ID(From 1-10): ");
		int id = sc.nextInt();
		
		if(id<1 || id>10) {
			id= incorrect(id);
		}
		
		menuDisplay();
		System.out.println("Enter your Choice:");
		int choice = sc.nextInt();
		
		switch (choice){
					case 1:
						
					System.out.println("The Balance is: "+acc[id-1].getBalance());
					break;
					
					case 2: 
						
					System.out.println("Enter Amount to Withdraw: ");
					acc[id-1].withdraw(sc.nextDouble());
					break;
					
					case 3:
						
					System.out.println("Enter Amount to Deposit: ");
					acc[id-1].withdraw(sc.nextDouble());
					break;
					
					case 4: 
						
					System.out.println("Enter account number to transfer money:");
					int id1 = sc.nextInt();
					System.out.println("Enter amount to transfer:");
					double amu= sc.nextDouble();
					acc[id-1].withdraw(amu);
					acc[id1-1].deposit(amu);
					System.out.println("Balance in your account after money transfer:"+acc[id-1].getBalance());
					System.out.println("Balance in the account you transfered money: "+acc[id1-1].getBalance());
					break;
					
					case 5: 
					System.out.println("Enter account ID and Balance:");
					int id3= sc.nextInt();
					double bal= sc.nextDouble();
					Account newacc = new Account(id3,bal);
					break;
					
					case 6: 
					System.out.println("To deacticvate your account visit neareast bank branch:");
					break;
					
					case 7: 
					System.out.println("Thank You for using the System.");
					break;
					
					default:
						break;
					
		}
	}
	
	public static int incorrect (int id) {
		Scanner sc = new Scanner(System.in);
		while (id<1 || id>10) {
			System.out.println("Enter valid ID: ");
			id = sc.nextInt();
			System.out.println();
		}
		return id;
	}
	 public static void menuDisplay() {
	        System.out.printf("%nMain menu%n");
	        System.out.println("1: Balance inquiry");
	        System.out.println("2: Withdraw money [Maintain minimum balance 300₹]");
	        System.out.println("3: Deposit money");
	        System.out.println("4: Money Transfer");
	        System.out.println("5: Create Account");
	        System.out.println("6: Deactivate Account");
	        System.out.println("7: exit");
	    }
}
