package fr.formation.proxibanque.metier;
/**
 * Classe permettant de caractï¿½riser un client via ses diffï¿½rents attributs
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

	}
	
		this.currentAccount = new Account();
		this.savingAccount = new Account();

	}
	
	/**
	 * Méthode toString permettant de redéfinir la méthode par défaut de Java
	 * @return String une chaine de caractères
	 */

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