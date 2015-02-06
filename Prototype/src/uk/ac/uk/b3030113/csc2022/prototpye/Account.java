package uk.ac.uk.b3030113.csc2022.prototpye;

public class Account {
	private int accountID;
	private double balance;
	private double overdraftLimit;
	//Need to decide how to implement
	//List<Transactions> transactionList;
	
	public void addBalance(double moneyIn){
		balance += moneyIn;
	}
	
	public void removeBalance(double moneyOut){
		balance -= moneyOut;
	}
	
	public void transferFund(double amount, Account to){
		removeBalance(amount);
		to.addBalance(amount);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getOverdraftLimit(){
		return overdraftLimit;
	}
	
	public int getAccountID(){
		return accountID;
	}
}
