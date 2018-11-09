package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caract�riser plus pr�cis�ment le compte associ� au client
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class SavingAccount extends Account{
	
	public int INTEREST_CASE = 3/100;

	/**
	 * Constructeur de la classe SavingAccount 
	 * @param accountNumber Num�ro de compte du compte �pargne
	 */ 	
	public SavingAccount(String accountNumber) {
		super(accountNumber);
		
	}

	
}
