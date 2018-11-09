package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caractï¿½riser plus prï¿½cisï¿½ment le compte associï¿½ au client
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class CurrentAccount extends Account{
	
	public int OVERDRAFT_PROTECTION = 1000;
	
	/**
	 * Constructeur par défaut de CurrentAccount
	 *
	 */
	public CurrentAccount() {
		super();
	}
}
