package fr.formation.proxibanque.metier;

public class Account {
	
	public String accountNumber;
	public double balance;
	public String accountCreationDate;
	
	public Account (String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.accountNumber);
		return sb.toString();
	}
}
