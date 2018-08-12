package Classes;

import java.util.Date;

public class Account {

	static int counter = 0;
	int id;
	double balance, annualInterestRate;
	Date dateCreated;

	public Account() {
		counter++;
		id = counter;
		balance = 0;
		annualInterestRate = 0.02;
		dateCreated = new Date();  
	}

	public Account(double balance, double annualInterestRate) {
		counter++;
		this.id = counter;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}

	public Account(double balance, double annualInterestRate, Date dateCreated) {
		counter++;
		this.id = counter;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	public String deposit(double add) {
		double old = balance;
		double updated = balance += add;
		return "ID: " + id + "\nCurrent balance: " + old + "\nUpdated Balance: " + updated;
	}

	public String withdraw(double subtract) {
		double old = balance;
		double updated = balance -= subtract;
		return "ID: " + id + "\nCurrent balance: " + old + "\nUpdated Balance: " + updated;
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

	public Date getDateCreated() {
		return dateCreated;
	}	

	public String toString() {
		return "ID: " + id + "\nBalance: " + balance + "\nAnnual Interest Rate: " + annualInterestRate +
				"\nDate Created: " + dateCreated;
	}

}
