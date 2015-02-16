package uk.ac.uk.b3030113.csc2022.prototpye;

public class Wallet {
	private String name;
	private int balancePoints;
	private double balanceMoney;
	//Can't think of other fields
	
	public Wallet(String name, int balancePoints){
		this.name = name;
		this.balancePoints = balancePoints;
	}
	
	public Wallet(String name, double balanceMoney){
		this.name = name;
		this.balanceMoney = balanceMoney;
	}
}
