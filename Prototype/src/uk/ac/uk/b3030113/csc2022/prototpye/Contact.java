package uk.ac.uk.b3030113.csc2022.prototpye;

public class Contact {

	private String name;
	private Account account;
	
	public Contact(String name, Account account){
		this.name = name;
		this.account = account;
	}
	
	
	public String getName(){
		return name;
	}
	
	public Account getAccount(){
		return account;
	}
}
