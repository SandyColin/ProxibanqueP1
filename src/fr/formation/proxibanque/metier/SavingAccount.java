package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caractériser plus précisément le compte associé au client
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class SavingAccount extends Account{
	
	public int INTEREST_CASE = 3/100;

	public SavingAccount(String accountNumber) {
		super(accountNumber);
		
	}

	
}
