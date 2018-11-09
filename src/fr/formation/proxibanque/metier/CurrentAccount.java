package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caractériser plus précisément le compte associé au client
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
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
