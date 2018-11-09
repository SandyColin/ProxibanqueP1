package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caractériser un compte client via ses différents attributs
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
	 * Méthode toString permettant de redéfinir la méthode par défaut de Java
	 * @return String une chaine de caractères
	 */ 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.accountNumber);
		return sb.toString();
	}
}
