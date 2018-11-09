package fr.formation.proxibanque.metier;

import fr.formation.proxibanque.presentation.Interaction;

public class Account {
	
	public String accountNumber;
	public double balance;
	public String accountCreationDate;
	
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



	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.accountNumber);
		return sb.toString();
	}
}
