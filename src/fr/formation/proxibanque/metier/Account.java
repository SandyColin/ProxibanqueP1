package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caract�riser un compte client via ses diff�rents attributs
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Account {
	
	public String accountNumber;
	public double balance;
	public String accountCreationDate;
	
	public Account (String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * Constructeur de la classe Account
	 * 
	 */ 
	public Account() {
		this.accountNumber = null;
		this.balance = 0;
	}

	/**
	 * M�thode toString permettant de red�finir la m�thode par d�faut de Java
	 * @return String une chaine de caract�res
	 */ 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.accountNumber);
		return sb.toString();
	}
}
