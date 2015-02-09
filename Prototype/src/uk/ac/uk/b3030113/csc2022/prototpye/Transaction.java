package uk.ac.uk.b3030113.csc2022.prototpye;

public class Transaction {
	private double amount;
	private String date;
	private Account from;
	private Account to;
	
	public Transaction(double amount, String date, Account from, Account to){
		this.amount = amount;
		this.date = date;
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString(){
		//return "£"+amount+" from account "+from.getAccountID()+" to account "+to.getAccountID()+" on the "+date;
		return date+"\t£"+amount+"\tFrom account"+from.getAccountID()+" to account "+to.getAccountID();
	}
}
