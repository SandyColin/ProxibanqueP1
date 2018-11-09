package fr.formation.proxibanque.metier;

import fr.formation.proxibanque.presentation.Interaction;

/**
 * Classe permettant de caract�riser un compte client via ses diff�rents attributs
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
 
public class Account {
	
	public String accountNumber;
	public double balance;
	public String accountCreationDate;
	
		/**
	 * Constructeur de la classe Account
	 * 
	 */ 
	public Account() {
		Interaction interaction = new Interaction();
		interaction.display("Saisissez le solde initial.");
		this.balance = Double.parseDouble(interaction.readData());
		interaction.display("Saisissez le numero du compte.");
		this.accountNumber = interaction.readData();
		interaction.display("Saisissez la date.");
		this.accountCreationDate = interaction.readData();
	}

	

	public Account(String accountNumber, double balance, String accountCreationDate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountCreationDate = accountCreationDate;
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
