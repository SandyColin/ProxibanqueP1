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
	

	/**
	 * Constructeur de la classe Client
	 * @param firstname Pr�nom du client
	 * @param lastname Nom du client
	 * @param adress Adresse du client
	 * @param zipCode Code Postal du client
	 * @param city Ville du client
	 * @param tel T�l�phone du client
	 * 
	 * 
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
		//this.currentAccount = new Account();
		//this.savingAccount = new Account();

	}
	
	/**
	 * M�thode toString permettant de red�finir la m�thode par d�faut de Java
	 * @return String une chaine de caract�res
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