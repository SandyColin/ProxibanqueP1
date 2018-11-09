package fr.formation.proxibanque.metier;
/**
 * Classe permettant de caract�riser un client via ses diff�rents attributs
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Client {

	public String firstname;
	public String lastname;
	public String adress;
	public int zipCode;
	public String city;
	public String tel;
	public Account Account;
	public CreditCard creditCard;
	public double balanceCurrentAccount;
	public double balanceSavingAccount;

	/**
	 * @param firstname
	 * @param lastname
	 * @param adress
	 * @param zipCode
	 * @param city
	 * @param tel
	 * @param currentAccount
	 * @param balanceCurrentAccount
	 * @param savingAccount
	 * @param balanceSavingAccount
	 */
	public Client(String firstname, String lastname, String adress, int zipCode, String city, 
			String tel ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.zipCode = zipCode;
		this.city = city;
		this.tel = tel;
		Account = new Account();
//		this.currentAccount = new CurrentAccount();
//		this.savingAccount = new SavingAccount();
//		this.currentAccount.balance; 
	}
	
//	public Client (String firstname, String lastname, Account currentAccount, Account savingAccount) {
//		this.firstname= firstname;
//		this.lastname = lastname;
//		this.currentAccount = new Account();
//		this.savingAccount = new Account();
//		
//	}
//	
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