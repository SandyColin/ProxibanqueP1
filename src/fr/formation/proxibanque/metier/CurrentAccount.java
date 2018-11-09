package fr.formation.proxibanque.metier;

public class CurrentAccount extends Account{
	
	public int OVERDRAFT_PROTECTION = 1000;

	public CurrentAccount(String accountNumber) {
		super(accountNumber);
		
	}
	
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber);
		super.balance = balance;
	}
	

	
}
