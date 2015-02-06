package uk.ac.uk.b3030113.csc2022.prototpye;

import java.util.List;

public class User {
	
	private String name;
	private int userID;
	private String birthday;
	private String address;
	private String password;
	private List<Account> accounts;
	
	public String getName() {
		return name;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	
}