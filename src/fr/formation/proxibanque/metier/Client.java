package fr.formation.proxibanque.metier;

public class Client {

	public String firstname;
	public String lastname;
	public String adress;
	public int zipCode;
	public String city;
	public String tel;
	public Account currentAccount;
	public Account savingAccount;
	public CreditCard creditCard;

	public Client(String firstname, String lastname, String adress, int zipCode, String city, 
			String tel, String currentAccount, String savingAccount) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.zipCode = zipCode;
		this.city = city;
		this.tel = tel;
		this.currentAccount = new Account();
		this.savingAccount = new Account();

	}
	public Client (String firstname, String lastname, Account currentAccount, Account savingAccount) {
		this.firstname= firstname;
		this.lastname = lastname;
		this.currentAccount = new Account();
		this.savingAccount = new Account();
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.firstname);
		sb.append(" ");
		sb.append(this.lastname);
		sb.append(" ");
		sb.append(this.tel);
		return sb.toString();
	}

	
}