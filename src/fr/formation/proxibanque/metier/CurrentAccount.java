package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caract�riser plus pr�cis�ment le compte associ� au client
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class CurrentAccount extends Account{
	
	public int OVERDRAFT_PROTECTION = 1000;

	/**
	 * Constructeur de la classe CurrentAccount
	 * @param accountNumber Num�ro de compte du compte courant
	 */ 
	public CurrentAccount(String accountNumber) {
		super(accountNumber);
		
	}
	
	/**
	 * Constructeur de la classe CurrentAccount
	 * @param accountNumber Num�ro de compte du compte courant
	 * @param balance Solde du compte courant
	 */ 
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber);
		super.balance = balance;
	}
	

	
}
